package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;


public class CureWounds implements AttackBehavior {
    
    @Override
    public int attack(DungeonCharacter hero) {
        int heal = 1 + Dice.d6();
        hero.addHitPoints(heal);
        return heal;
    }

    @Override
    public String getName() {
        return "CureWounds";
    }
    
    @Override
    public String toString() {
        return " used Cure Wounds and healed for ";
    }
    
}