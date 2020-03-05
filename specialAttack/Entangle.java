package specialAttack;

import main.Dice;
import gameCharacters.DungeonCharacter;

public class Entangle implements SpecialAttack {
    @Override
    public int specialAttack(DungeonCharacter enemy) {
        int dam = Dice.d4();
        enemy.subtractHitPoints(dam);
        int init = enemy.getInitiative();
        enemy.setInitiative(init - 4);
        return dam;
    }

    @Override
    public String getName() {
        return "Entangle";
    }


    @Override
    public String toString() {
        return " casts Entangle, slowing and dealing ";
    }
}

