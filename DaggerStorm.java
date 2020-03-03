package gameCharacters;

public class DaggerStorm implements SpecialAttack {

    private int count;

    @Override
    public void specialAttack(DungeonCharacter enemy) {
        for (int i = 0; i < 4; i++) {
            if (Dice.d20() - enemy.getAC() > 0) {
                this.count++;
            }
            if (this.count > 0) {
                for (int j = 0; j < this.count; j++) {
                    int dam = Dice.d4();
                    enemy.subtractHitPoints(dam);
                    System.out.printf("Your Dagger Storm hits the %s for %d damage!\n", enemy.getName(), dam);
                }
                System.out.printf("Your Dagger Storm hit %d times!", count);
            } else {
                System.out.printf("You miss the %s with your dagger storm.\n", enemy.getName());
            }
        }
    }
}
