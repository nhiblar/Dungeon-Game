package gameCharacters;

import attack.AttackBehavior;

public class Dragonborn extends Hero {

	
	public Dragonborn(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Dragonborn");
	}

}
