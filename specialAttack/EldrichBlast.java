package specialAttack;

import main.Dice;
import gameCharacters.DungeonCharacter;

public class EldrichBlast implements SpecialAttack {
    @Override
    public int specialAttack(DungeonCharacter enemy) {
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


