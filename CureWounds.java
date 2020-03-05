public class CureWounds implements SpecialAttack {
    //healing spell

    @Override
    public int specialAttack(DungeonCharacter hero) {
        int heal = Dice.d6() * 3;
        hero.addHitPoints(heal);
        return heal;
    }

    @Override
    public String getName() {
        return " used Cure Wounds and healed for ";
    }
}