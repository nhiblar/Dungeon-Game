package attack;

import main.Dice;
import gameCharacters.DungeonCharacter;

public class Quarterstaff implements AttackBehavior {

    @Override
    public int attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = 1 + Dice.d6();
            enemy.subtractHitPoints(dam);
            return dam;
        } else {
            return 0;
        }
    }

    @Override
    public String getName() {
        return "Quarterstaff";
    }

    @Override
    public String toString() {
        return " smacks ";
    }

}
