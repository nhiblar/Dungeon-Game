package gameCharacters;

public class Mace implements AttackBehavior {

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
}
