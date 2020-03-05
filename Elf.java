package gameCharacters;

public class Elf extends Hero {
	
	public Elf(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Elf");
	}

}