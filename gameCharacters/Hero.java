package gameCharacters;

public class Hero extends DungeonCharacter implements AttackBehavior{

	private String charRace;
	private String charClass;
	private SpecialAttack specialAttack;
	
	public Hero(String name, int hitPoints, int initiative, int ac, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
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

	public SpecialAttack getSpecialAttack() {
		return this.specialAttack;
	}
	
	public int specialAttack(DungeonCharacter enemy) {
		return specialAttack.specialAttack(enemy);
	}
	
	@Override
	public int attack(DungeonCharacter enemy) {
		return attackBehavior.attack(enemy);
	}
	

}//end Hero class