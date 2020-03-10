package gameCharacters;

import attack.AttackBehavior;
import specialAttack.SpecialAttack;

public class Hero extends DungeonCharacter implements AttackBehavior {

	private String charRace;
	private String charClass;
	private AttackBehavior defaultAttack;
	private int mana = 3;
	
	public Hero(String name, int hitPoints, int initiative, int ac, AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		defaultAttack = ab;
	}

	public String getCharClass() { return this.charClass; }
	protected void setCharClass(String charClass) { this.charClass = charClass;	}
	
	public int getMana() { return this.mana; }
	public void setMana(int mana) { this.mana = mana; }

	public String getCharRace() { return this.charRace; }
	protected void setCharRace(String charRace) { this.charRace = charRace; }

	public AttackBehavior getDefaultAttack() { return this.defaultAttack; }
	public void setDefaultAttack(AttackBehavior ab) {this.defaultAttack = ab; }
	
	public void setNewAttackBehavior(int i) {
		if(i == 1)
			setAttackBehavior(defaultAttack);
		if(i == 2)
			setAttackBehavior(AssignSpecialAttacks.getSpecialAttack(this.charClass));
	}

	@Override
	public int compareTo(DungeonCharacter arg0) {
		return this.AC - arg0.getAC();
	}

	@Override
	public int attack(DungeonCharacter enemy) {
		return attackBehavior.attack(enemy);
	}

}//end Hero class