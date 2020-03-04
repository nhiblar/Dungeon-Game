package gameCharacters;

public class Club implements AttackBehavior {

    public int attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d8();
            enemy.subtractHitPoints(dam);
            return dam;
        }
        return 0;
    }

    public String toString() {
        return " bashes ";
    }
}


