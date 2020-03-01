public abstract class DungeonCharacter implements AttackBehavior, SpecialAttack{

	protected String name;
	protected int hitPoints;
	protected int initiative;
	protected int AC;
	protected int damageDie;

	public int getAC() {
		return AC;
	}

	public void setAC(int AC) {
		this.AC = AC;
	}

	public int getDamageDie() {
		return damageDie;
	}

	public void setDamageDie(int damageDie) {
		this.damageDie = damageDie;
	}

	public DungeonCharacter(String name, int hitPoints, int initiative,
				     int AC, int damageDie, int damageResist) {

		this.name = name;
		this.hitPoints = hitPoints;
		this.initiative = initiative;
		this.AC = AC;
		this.damageDie = damageDie;

	}//end constructor

	public String getName() {
		return name;
	}//end getName

	public int getHitPoints() {
		return hitPoints;
	}//end getHitPoints

	public void addHitPoints(int hitPoints) {
		if (hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.");
		else {
			this.hitPoints += hitPoints;
		}
	}
	
	public void subtractHitPoints(int hitPoints) {
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitPoints >0) {
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " hit " +
								" for <" + hitPoints + "> points damage.");
			System.out.println(getName() + " now has " +
								getHitPoints() + " hit points remaining.");
			System.out.println();
		}//end else if

		if (this.hitPoints == 0)
			System.out.println(name + " has been killed :-(");
		
	}//end method

	public boolean isAlive() {
	  return (hitPoints > 0);
	}//end isAlive method

	public abstract void attack(DungeonCharacter opponent);
	
}