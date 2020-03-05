package gameCharacters;

import attack.AttackBehavior;

public class Triton extends Hero {
	
	public Triton(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Triton");
	}

}
