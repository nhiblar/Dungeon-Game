package DungeonGame;

public class HalfElf extends Hero {

	public HalfElf(String name, int hitPoints, int initiative, int ac, int damageDie, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("HalfElf");
	}

	
	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
