package gameCharacters;

import attack.AttackBehavior;

public class Tabaxi extends Hero {

	public Tabaxi(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Tabaxi");
	}

}
