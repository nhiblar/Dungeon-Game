package gameCharacters;

public abstract class Hero extends DungeonCharacter{

	private String charRace;
	private String charClass;
	private SpecialAttack specialAttack;
	
	public Hero(String name, int hitPoints, int initiative, int ac, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
	}
	
	protected SpecialAttack setSpecialAttack(String sa) {
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
	/*
	public void printHero() {
		System.out.println("Race: " + this.getCharRace() + "\nClass: " + this.getCharClass() + "\nName: " + this.getName());
		System.out.println("Special Attack: " + this.getSpecialAttack().getClass());
	}
	*/
}//end Hero class