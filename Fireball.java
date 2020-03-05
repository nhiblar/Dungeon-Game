package gameCharacters;

public class Fireball implements SpecialAttack {
    //Auto hits for big damage!
    @Override
    public int specialAttack(DungeonCharacter enemy) {
        int dam = Dice.d6() * 3;
        enemy.subtractHitPoints(dam);
        return dam;
    }

    @Override
    public String getName() {
        return "Fireball";
    }


    @Override
    public String toString() {
        return " casts Fireball dealing ";
    }
}

