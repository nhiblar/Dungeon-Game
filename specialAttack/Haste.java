package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;

public class Haste implements AttackBehavior {
    @Override
    public int attack(DungeonCharacter hero) {
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

