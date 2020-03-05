package gameCharacters;

public class DaggerStorm implements SpecialAttack {

    private int count;

    @Override
    public int specialAttack(DungeonCharacter enemy) {        
    	int dam = 0;
    	for (int i = 0; i < 4; i++) {
            if (Dice.d20() - enemy.getAC() > 0) {
                this.count++;
            }
            if (this.count > 0) {
                for (int j = 0; j < this.count; j++) {
                    dam += Dice.d4();
                    enemy.subtractHitPoints(dam);
                }
            }
        }
        return dam;
    }

    @Override
    public String toString() {
        return " used Dagger Storm, hitting " + this.count + " times for ";
    }
    
    @Override
    public String getName() {
    	return "Dagger Storm";
    }
}
