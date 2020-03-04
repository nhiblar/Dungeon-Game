package gameCharacters;

public abstract class Hero extends DungeonCharacter implements AttackBehavior{

	private String charRace;
	private String charClass;
	private SpecialAttack specialAttack;
	
	public Hero(String name, int hitPoints, int initiative, int ac, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
	}
	
	public SpecialAttack setSpecialAttack(String sa) {
		return AssignSpecialAttacks.getSpecialAttack(sa);
	}
	public SpecialAttack getSpecialAttack() {
		return this.specialAttack;
	}
	
	protected void setCharClass(String charClass) {
		this.charClass = charClass;	
		this.specialAttack = AssignSpecialAttacks.getSpecialAttack(charClass);
	}
	
	public String getCharClass() { return this.charClass; }

	protected void setCharRace(String charRace) {
		this.charRace = charRace;
	}

	public String getCharRace() { return this.charRace; }

}//end Hero class