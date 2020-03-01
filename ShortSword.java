public class ShortSword implements AttackBehavior {

    @Override
    public void attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d6();
            enemy.subtractHitPoints(dam);
            System.out.printf("You slash the %s for %d damage!\n", enemy.getName(), dam);
        } else {
            System.out.printf("You miss the %s with your attack.\n", enemy.getName());
        }
    }

}
