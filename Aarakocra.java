package gameCharacters;

public class Aarakocra extends Hero{
	
	public Aarakocra(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Aarakocra");
	}

	@Override
	public int attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
