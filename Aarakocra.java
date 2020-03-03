package DungeonGame;

public class Aarakocra extends Hero{
	
	public Aarakocra(String name, int hitPoints, int initiative, int ac, int damageDie,
					 String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("Aarakocra");
	}

	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		
	}

	
}
