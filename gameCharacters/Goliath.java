package gameCharacters;

import attack.AttackBehavior;

public class Goliath extends Hero {

	public Goliath(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Goliath");
	}

}
