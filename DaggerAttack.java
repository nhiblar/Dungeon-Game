import java.util.Random;

public class DaggerAttack implements AttackBehavior {


    @Override
    public void attack(DungeonCharacter enemy) {
        int dam;
        //Main hand attack
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            dam = Dice.d4();
            enemy.subtractHitPoints(dam);
            System.out.printf("You stab the %s with your main dagger for %d damage!\n", enemy.getName(), dam);
        }
        //Offhand attack
        doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            dam = Dice.d4();
            enemy.subtractHitPoints(dam);
            System.out.printf("You stab the %s with your off hand dagger for %d damage!\n", enemy.getName(), dam);
        }
    }

//    @Override
//    public int rollD20() {
//        Random random = new Random();
//        return random.nextInt(20) + 1;
//    }
//
//
//    private int rollD4() {
//        Random random = new Random();
//        return random.nextInt(4) + 1;
//    }


}
