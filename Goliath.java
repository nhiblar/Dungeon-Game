package DungeonGame;

public class Goliath extends Hero {

	public Goliath(String name, int hitPoints, int initiative, int ac, int damageDie, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("Goliath");
	}

	
	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
