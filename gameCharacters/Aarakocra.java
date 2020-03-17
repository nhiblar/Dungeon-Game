package gameCharacters;

import attack.AttackBehavior;

public class Aarakocra extends Hero{
	
	public Aarakocra(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Aarakocra");
	}

}
