package specialAttack;

import main.Dice;
import attack.AttackBehavior;
import gameCharacters.DungeonCharacter;


public class Entangle implements AttackBehavior {
   
	@Override
    public int attack(DungeonCharacter enemy) {
        int dam = Dice.d4();
        enemy.subtractHitPoints(dam);
        enemy.setInitiative(1);
        return dam;
    }

    @Override
    public String getName() {
        return "Entangle";
    }

    @Override
    public String toString() {
        return " casts Entangle, slowing and dealing ";
    }

}

