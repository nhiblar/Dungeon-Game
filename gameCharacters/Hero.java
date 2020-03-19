package gameCharacters;

import attack.AttackBehavior;
import main.Dungeon;

public class Hero extends DungeonCharacter implements AttackBehavior {

	private String charRace;
	private String charClass;
	private AttackBehavior defaultAttack;
	private int mana = 3;
	private int visionPotionCount = 1;
	private int healPotionCount = 1;
	private int manaPotionCount = 1;
	private int keyCount = 0;

	public Hero(final String name, final int hitPoints, final int initiative, final int ac, final AttackBehavior ab) {
		super(name, hitPoints, initiative, ac, ab);
		defaultAttack = ab;
	}

	public String getCharClass() { return this.charClass; }
	protected void setCharClass(final String charClass) { this.charClass = charClass;	}

	public int getMana() { return this.mana; }
	public void setMana(final int mana) { this.mana = mana; }

	public String getCharRace() { return this.charRace; }
	protected void setCharRace(final String charRace) { this.charRace = charRace; }

	public AttackBehavior getDefaultAttack() { return this.defaultAttack; }
	public void setDefaultAttack(final AttackBehavior ab) {this.defaultAttack = ab; }

	public void setNewAttackBehavior(final int i) {
		if(i == 1)
			setAttackBehavior(defaultAttack);
		if(i == 2)
			setAttackBehavior(AssignSpecialAttacks.getSpecialAttack(this.charClass));
	}

	public void increaseVisionPotionCount(){
		this.visionPotionCount++;
		System.out.print("\nYou gained a Vision potion!\n");
	}

	public void increaseHealPotionCount(){
		this.healPotionCount++;
		System.out.print("\nYou gained a Heal potion!\n");
	}

	public void increaseManaPotionCount(){
		this.manaPotionCount++;
		System.out.print("\nYou gained a Mana potion!\n");
	}

	public void decreaseVisionPotionCount(){
		this.visionPotionCount--;
	}

	public void decreaseHealPotionCount(){
		this.healPotionCount--;
	}

	public void decreaseManaPotionCount(){
		this.manaPotionCount--;
	}


	public int getVisionPotionCount(){
		return this.visionPotionCount;
	}

	public int getHealPotionCount(){
		return this.healPotionCount;
	}

	public int getManaPotionCount(){
		return this.manaPotionCount;
	}

	public void useVisionPotion(){
		//placeholder for code
		System.out.print("Hero: vision potion\n");
		decreaseVisionPotionCount();
		Dungeon.printVisionPotion();
	}

	public void useHealPotion(){
		addHitPoints(20);
		decreaseHealPotionCount();
		System.out.print("Hero: heal potion\n");
	}

	public void useManaPotion(){
		addManaPoints(2);
		decreaseManaPotionCount();
		System.out.print("Hero: mana potion\n");
	}

	public void addManaPoints(final int mp){
		if (mp <=0)
			System.out.println("mana amount must be positive.");
		else {
			this.mana += mp;
		}
	}


	public int getKeyCount()
	{
		return keyCount;
	}

	public void increaseKeyCount()
	{
		this.keyCount++;
	}

	@Override
	public int compareTo(final DungeonCharacter arg0) {
		return this.AC - arg0.getAC();
	}

	@Override
	public int attack(final DungeonCharacter enemy) {
		return attackBehavior.attack(enemy);
	}

}//end Hero class