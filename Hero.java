package DungeonGame;

public abstract class Hero extends DungeonCharacter{

	private String charClass;
	private String charRace;
	private SpecialAttack specialAttack;
	
	public Hero(String name, int hitPoints, int initiative, int ac, int damageDie, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, damageDie, ab);
		//setSpecialAttack(sa);
	}
	
	protected void setSpecialAttack(SpecialAttack sa) { this.specialAttack = sa; }
	public SpecialAttack getSpecialAttack() { return this.specialAttack; }
	
	protected void setCharClass(String charClass) { this.charClass = charClass;	}
	public String getCharClass() { return this.charClass; }

	protected void setCharRace(String charRace) { this.charRace = charRace;	}
	public String getCharRace() { return this.charRace; }
	
	public void printHero() {
		System.out.println("Race: " + this.getCharRace() + "\nClass: " + this.getCharClass() + "\nName: " + this.getName());
	}
	
}//end Hero class