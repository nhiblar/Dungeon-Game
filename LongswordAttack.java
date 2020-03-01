import java.util.Random;

public class LongswordAttack implements AttackBehavior {

    @Override
    public void attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d8();
            enemy.subtractHitPoints(dam);
            System.out.printf("You slash the %s for %d damage!\n", enemy.getName(), dam);
        } else {
            System.out.printf("You miss the %s with your attack.\n", enemy.getName());
        }
    }

//    @Override
//    public int rollD20() {
//        Random random = new Random();
//        return random.nextInt(20) + 1;
//    }
//
//
//    private int rollD8() {
//        Random random = new Random();
//        return random.nextInt(8) + 1;
//    }


}
