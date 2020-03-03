package DungeonGame;

public class Tabaxi extends Hero {

	public Tabaxi(String name, int hitPoints, int initiative, int ac, int damageDie, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("Tabaxi");
	}

	
	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
