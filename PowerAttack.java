public class PowerAttack implements SpecialAttack {

    @Override
    public void specialAttack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d8() + Dice.d8();
            enemy.subtractHitPoints(dam);
            System.out.printf("Your power attack demolishes %s for %d damage!\n", enemy.getName(), dam);
        } else {
            System.out.printf("You miss the %s with your power attack.\n", enemy.getName());
        }
    }

//    @Override
//    public int rollD20() {
//        Random random = new Random();
//        return random.nextInt(20) + 1;
//    }
//
//    private int rollD8() {
//        Random random = new Random();
//        return random.nextInt(8) + 1;
//    }
}
