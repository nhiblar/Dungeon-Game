package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;


public class Fireball implements AttackBehavior {
    @Override
    public int attack(DungeonCharacter enemy) {
        int dam = Dice.d6() * 3;
        enemy.subtractHitPoints(dam);
        return dam;
    }

    @Override
    public String getName() {
        return "Fireball";
    }


    @Override
    public String toString() {
        return " casts Fireball dealing ";
    }
}

