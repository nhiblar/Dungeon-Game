public class ShortSword implements AttackBehavior {

    @Override
    public int attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d6();
            enemy.subtractHitPoints(dam);
            return dam;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return " slices ";
    }
}
