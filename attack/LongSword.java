package attack;

import gameCharacters.DungeonCharacter;
import main.Dice;

public class LongSword implements AttackBehavior {

	@Override
	public int attack(final DungeonCharacter enemy) {
		boolean doesHit = Dice.d20() - enemy.getAC() > 0;
		if (doesHit) {
			int dam = 2 + Dice.d8();
			enemy.subtractHitPoints(dam);
			return dam;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return " slashes ";
	}

	@Override
	public String getName() {
		return "Longsword";
	}
}
