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
            } else { dam = 0; }
        }
    	return dam;
    }
    
    public String toString() {
    	return (count == 1) ? "Dagger Storm slashes once across " : "Dagger Storm slashes " + count + " times across";
    }
    
    public String getName() {
    	return "Dagger Storm";
    }
}
