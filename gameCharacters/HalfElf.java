package gameCharacters;

import attack.AttackBehavior;

public class HalfElf extends Hero {

	public HalfElf(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("HalfElf");
	}

}
