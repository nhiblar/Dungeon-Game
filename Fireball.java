package gameCharacters;

public class Fireball implements SpecialAttack {
    //Auto hits for big damage!
    @Override
    public void specialAttack(DungeonCharacter enemy) {
        int dam = Dice.d6() * 3;
        enemy.subtractHitPoints(dam);
        System.out.printf("Your massive Fireball explodes for %d damage!\n", dam);
    }
}

