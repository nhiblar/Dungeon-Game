package gameCharacters;

public class Goliath extends Hero {

	public Goliath(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Goliath");
	}

	
	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
