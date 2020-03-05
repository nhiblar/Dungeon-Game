package gameCharacters;

public class Tabaxi extends Hero {

	public Tabaxi(String name, int hitPoints, int initiative, int ac, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		setCharClass(charClass);
		setCharRace("Tabaxi");
	}

	@Override
	public int attack(DungeonCharacter enemy) {
		// TODO Auto-generated method stub
		return 0;
	}


}
