package gameCharacters;

public class LongSword implements AttackBehavior {

    @Override
    public int attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d8();
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
}
