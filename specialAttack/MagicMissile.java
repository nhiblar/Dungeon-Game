package specialAttack;

import main.Dice;
import gameCharacters.DungeonCharacter;

public class MagicMissile implements SpecialAttack {
    //Auto hits for big damage!
    @Override
    public int specialAttack(DungeonCharacter enemy) {
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

