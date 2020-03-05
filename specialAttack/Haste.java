package specialAttack;

import gameCharacters.DungeonCharacter;
import main.Dice;

import static main.DungeonDriver.hero;

public class Haste implements SpecialAttack {
    @Override
    public int specialAttack(DungeonCharacter hero) {
        int dam = Dice.d4();
        hero.subtractHitPoints(dam);
        int init = hero.getInitiative();
        hero.setInitiative(init + 4);
        return dam;
    }

    @Override
    public String getName() {
        return "Haste";
    }


    @Override
    public String toString() {
        return " casts Haste, speeding up and dealing ";
    }
}

