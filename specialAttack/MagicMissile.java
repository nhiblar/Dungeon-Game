package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;


public class MagicMissile implements AttackBehavior {
    
	@Override
    public int attack(DungeonCharacter enemy) {
        int dam = Dice.d8() * 2;
        enemy.subtractHitPoints(dam);
        return dam;
    }

    @Override
    public String getName() {
        return "Magic Missile";
    }


    @Override
    public String toString() {
        return " casts Magic Missile, dealing ";
    }
}

