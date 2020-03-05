package attack;

import main.Dice;
import gameCharacters.DungeonCharacter;

public class Dagger implements AttackBehavior {

    private int damage;

    public int attack(DungeonCharacter enemy) {
        int dam;
        //Main hand attack
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            dam = 1 + Dice.d4();
            enemy.subtractHitPoints(dam);
            damage = dam;
        }
        //Offhand attack
        doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            dam = Dice.d4();
            enemy.subtractHitPoints(dam);
            damage += dam;
        }
        return this.damage;
    }

    @Override
    public String getName() {
        return "Dagger";
    }

    @Override
    public String toString() {
        return " stabs ";
    }

}
