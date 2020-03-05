public class DaggerStorm implements SpecialAttack {

    private int count;

    @Override
    public int specialAttack(DungeonCharacter enemy) {
        for (int i = 0; i < 4; i++) {
            if (Dice.d20() - enemy.getAC() > 0) {
                this.count++;
            }
            if (this.count > 0) {
                for (int j = 0; j < this.count; j++) {
                    int dam = Dice.d4();
                    enemy.subtractHitPoints(dam);
                }
            }
        }
        return count;
    }

    @Override
    public String getName() {
        return " used Dagger Storm, hitting %d times for ";
    }
}
