package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;


public class LowerGuard implements AttackBehavior {
    @Override
    public int attack(DungeonCharacter enemy) {
        int dam = Dice.d4();
        if(enemy.getAC() > 1) {
	        enemy.setAC(enemy.getAC() - dam);
	    }
        return dam;
    }

    @Override
    public String getName() {
        return "Lower Guard";
    }

    @Override
    public String toString() {
        return "cripples the defense of";
    }
}
