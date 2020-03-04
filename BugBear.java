package gameCharacters;

public class BugBear extends Hero {

	public BugBear(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
	
		super(name, hitPoints, initiative, ac, ab);
		setCharRace("BugBear");
		setCharClass(charClass);
		//setSpecialAttack(charClass);
	}
	
	@Override
	public void attack(DungeonCharacter opponent) {
		
	}

}

