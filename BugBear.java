package DungeonGame;

public class BugBear extends Hero {

	public BugBear(String name, int hitPoints, int initiative, int ac, int damageDie,
			 String charClass, AttackBehavior ab) {
	
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("BugBear");
	}
	
	@Override
	public void attack(DungeonCharacter opponent) {
		
	}

}

