package gameCharacters;

public class Gnome extends Hero {

	public Gnome(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Gnome");
	}

	
	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
