package gameCharacters;

public class PowerAttack implements SpecialAttack {

    @Override
    public int specialAttack(DungeonCharacter enemy) {
        boolean doesHit = Dice.d20() - enemy.getAC() > 0;
        if (doesHit) {
            int dam = Dice.d8() + Dice.d8();
            enemy.subtractHitPoints(dam);
            return dam;
        }
        return 0;
    }

    @Override
    public String getName() {
        return "Power Attack";
    }

    @Override
    public String toString() {
        return " uses Power Attack and deals ";
    }
}
