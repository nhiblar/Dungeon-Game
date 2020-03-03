package DungeonGame;

public class Dragonborn extends Hero {

	
	public Dragonborn(String name, int hitPoints, int initiative, int ac, int damageDie, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("Dragonborn");
	}

	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
