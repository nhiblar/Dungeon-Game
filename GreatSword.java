public class GreatSword implements AttackBehavior {

    @Override
    public int attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d6() + Dice.d6();
            enemy.subtractHitPoints(dam);
            return dam;
        }
        return 0;
    }

    @Override
    public String getName() {
        return "Great Sword";
    }

    @Override
    public String toString() {
        return " cleaves ";
    }
}
