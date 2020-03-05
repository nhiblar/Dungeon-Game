package gameCharacters;

public class LongSword implements AttackBehavior {

    public int attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = 2 + Dice.d8();
            enemy.subtractHitPoints(dam);
            return dam;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return " slashes ";
    }

    public String getName() {
        return "Great sword";
    }
}
