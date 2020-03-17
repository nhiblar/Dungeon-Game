package gameCharacters;

import attack.AttackBehavior;
import specialAttack.SpecialAttack;

public class Hero extends DungeonCharacter implements AttackBehavior {

	private String charRace;
	private String charClass;
	private AttackBehavior defaultAttack;
	private int mana = 3;
   private int visionPotionCount = 1;
   private int healPotionCount = 1;
   private int manaPotionCount = 1;
	
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
      System.out.print("Hero: vision potion");
      //Dungeon.printVisionPotion()
   }
   
   public void useHealPotion(){
      //placeholder for code
      System.out.print("Hero: heal potion");
   }
   
   public void useManaPotion(){
      addManaPoints(2);
      System.out.print("Hero: mana potion");
   }

   public void addManaPoints(int mp){
      if (mp <=0)
			System.out.println("mana amount must be positive.");
		else {
			this.mana += mp;
      }   
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