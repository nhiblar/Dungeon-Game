package DungeonGame;

public class Elf extends Hero {

	
	public Elf(String name, int hitPoints, int initiative, int ac, int damageDie, String charClass, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		setCharClass(charClass);
		setCharRace("Elf");
	}

	@Override
	public void attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub

	}

}
