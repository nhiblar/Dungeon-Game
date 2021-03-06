package gameCharacters;

import attack.AttackBehavior;

public abstract class DungeonCharacter implements AttackBehavior, Comparable<DungeonCharacter>{

	protected String name;
	protected int hitPoints;
	protected int initiative;
	protected int AC;
	protected AttackBehavior attackBehavior;

	public DungeonCharacter(String name, int hitPoints, int initiative, int AC, AttackBehavior attackBehavior) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.initiative = initiative;
		this.AC = AC;
		this.attackBehavior = attackBehavior;
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int AC) {
		this.AC = AC;
	}

	public String getName() {
		return name;
	}//end getName
	
	public AttackBehavior getAttackBehavior() {
		return this.attackBehavior;
	}
	
	public void setAttackBehavior(AttackBehavior ab) {
		this.attackBehavior = ab;
	}

	public int getHitPoints() {
		return hitPoints;
	}//end getHitPoints

	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative){
		this.initiative = initiative;
	}
	
	public void addHitPoints(int hitPoints) {
		if (hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.");
		else {
			this.hitPoints += hitPoints;
		}
	}
	
	public void subtractHitPoints(int hitPoints) {
		if (hitPoints < 0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitPoints > 0) {
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
		}
	}//end method

	public boolean isAlive() {
		return (hitPoints > 0);
	}//end isAlive method

}