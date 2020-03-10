package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;

public class DaggerStorm implements AttackBehavior {

    private int count;

    @Override
    public int attack(DungeonCharacter enemy) {
    	int dam = 0;
    	for (int i = 0; i < 3; i++) {
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
