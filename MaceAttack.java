import java.util.Random;

public class MaceAttack implements AttackBehavior {

    @Override
    public void attack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d6();
            enemy.subtractHitPoints(dam);
            System.out.printf("You smash the %s for %d damage with your mace!\n", enemy.getName(), dam);
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
//    private int rollD6() {
//        Random random = new Random();
//        return random.nextInt(6) + 1;
//    }


}
