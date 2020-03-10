package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;

public class EldrichBlast implements AttackBehavior {
    @Override
    public int attack(DungeonCharacter enemy) {
        int dam = Dice.d10() * 2;
        enemy.subtractHitPoints(dam);
        return dam;
    }

    @Override
    public String getName() {
        return "Eldrich Blast";
    }


    @Override
    public String toString() {
        return " fires off an Eldrich Blast dealing ";
    }
}


