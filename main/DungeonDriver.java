package main;

import java.util.ArrayList;
import java.util.Collections;
import gameCharacters.*;
import specialAttack.*;
//import item.*;

public class DungeonDriver {
    	
 	private static Hero hero;
    	
     public static void main(String[] args) {

    	 HeroFactory heroFactory = new HeroFactory();
	     hero = heroFactory.newHero(GetUserInput.getRaceFromUser(), GetUserInput.getClassFromUser(), GetUserInput.getNameFromUser());
	     System.out.println(hero.getName() + " the " + hero.getCharRace() + ", " + hero.getCharClass() +
	        	" has base stats of: \n" + hero.getHitPoints() + " HP, " + hero.getAC() + " AC, " + hero.getInitiative() + " Initiative, " + hero.getMana() + " MP");
	    	
        String again = "y";
        boolean win = false;
        
        while(again.equals("y")){
        	Dungeon dungeon = new Dungeon();
        	while(hero.isAlive() && (win == false)) {

        		Room cur = new Room(dungeon.getDungeon(), hero.getKeyCount());
        		
        		if(cur.hasTrap()) {
        	    	Trap.trap(hero);
        	    }
                if(cur.hasMonster() && (hero.isAlive())) {
                	MonsterFactory monsterFactory = new MonsterFactory();
            	    Monster enemy = monsterFactory.newMonster(Dice.d6());
            	    System.out.println(hero.getName() + " is attacked by a " + enemy.toString() + "." );
            	    combat(enemy);
                }
        	    if(cur.hasKey() && (hero.isAlive())) {
        	    	System.out.println("You found a small key in this room. Maybe it will help you escape.");
        	    	hero.setKeyCount();
        	    }
        	    
        	    if(cur.hasPotion() && (hero.isAlive())) {
	        	    if(cur.hasHealPotion()) {
	        	    	hero.setHealPotionCount();
	        	    	System.out.println("You found a health potion."); }
	        	    if(cur.hasManaPotion()) {
	        	    	hero.setManaPotionCount();
	        	    	System.out.println("You found a mana potion."); }
	        	    if(cur.hasVisionPotion()) {
	        	    	hero.setVisionPotionCount();
	        	    	System.out.println("You found a vision potion."); }
	        	    System.out.println("Current potion count is: " + hero.getHealPotionCount() + " health potion(s) "
	        	    	+ hero.getManaPotionCount() + " mana potion(s) " + hero.getVisionPotionCount() + " vision potion(s).");
        	    }
        	
        	if(hero.isAlive()) {
	        	userPotion(hero, dungeon);
	       	    if((hero.getKeyCount() > 3) && (dungeon.getXLoc() == 20 ) && (dungeon.getYLoc()) == 36) win = true;     	
	       	    System.out.println("Current room: ");
	       	    cur.printRoom(dungeon.getDungeon(), dungeon.getXLoc(), dungeon.getYLoc());
	       	    dungeon.move(GetUserInput.direction(), cur);
        		}
    	    }
	   	again = GetUserInput.getPlayAgainUser();
     	}
       	System.out.println("- - -   G A M E   O V E R   - - -");
     }

        private static void combat(DungeonCharacter monster) {
        	
        	ArrayList<DungeonCharacter> fightOrder = new ArrayList<DungeonCharacter>();
        	fightOrder.add(monster);
        	fightOrder.add(hero);
        	Collections.sort(fightOrder);
        	
        	while ((hero.isAlive() && monster.isAlive())) {
        		System.out.println("Attack with your " + hero.getDefaultAttack().getName() + " (1) or " + AssignSpecialAttacks.getSpecialAttack(hero.getCharClass()).getName() + " (2) ?");
        		hero.setNewAttackBehavior(GetUserInput.getAttackFromUser());
            	if(SpecialBuff.isSpecialBuff(hero.getAttackBehavior().getName())) { healTurn(hero, monster); }
            	else damageExchange(fightOrder);
        		printHealthState(hero, monster);
        	}
        }
        
        
        private static void userPotion(Hero hero, Dungeon dungeon){
          if(hero.getVisionPotionCount() > 0 || hero.getHealPotionCount() > 0 || hero.getManaPotionCount() > 0){
                System.out.print("\nWould you like to use a potion?\n");
                String response = GetUserInput.getYesOrNoResponse();
                
                if(response.equals("Y")){
                   System.out.print("\nWhich potion would you you like to use?\n");
                   if(hero.getVisionPotionCount() > 0)
                      System.out.print("VP) Vision Potion\n");
                   if(hero.getHealPotionCount() > 0)
                      System.out.print("HP) Heal Potion\n");
                   if(hero.getManaPotionCount() > 0)
                      System.out.print("MP) Mana Potion\n");
                      
                   String potionResponse = GetUserInput.getPotionResponse();
                   
                   if(potionResponse.equals("VP")){
                      System.out.print(hero.getName() + " uses Vision potion.\n");
                      dungeon.printVisionPotion();   
                   }
                   
                   if(potionResponse.equals("HP")){
                      System.out.print(hero.getName() + " uses Heal Potion and increases hit points by 5.\n");
                      hero.useHealPotion();
                      System.out.print(hero.getName() + " now has " + hero.getHitPoints() + ".\n");
                   }
                   
                   if(potionResponse.equals("MP")){
                      System.out.print(hero.getName() + " uses Mana Potion and increases mana points by 2.\n");
                      hero.useManaPotion();
                      System.out.print(hero.getName() + " now has " + hero.getMana() + ".\n");
                   }
                   
                }
                
             }
        }
        
        private static void healTurn(Hero hero, DungeonCharacter monster) {
        	
        	if(hero.getMana() < 1)
        		System.out.println("You have run out of mana and can no longer cast " + hero.getAttackBehavior().getName());
        	
        	else {
    	    	int bonus = hero.attack(hero);
    	    	System.out.println("You" + hero.getAttackBehavior().toString() + bonus);
    	    	hero.setMana(hero.getMana() - 1);
    	    	
    	    	int dmg = monster.attack(hero);
    	    	String dmgOut = "";
    	    	if(dmg > 0) dmgOut += monster.getName() + "" + monster.getAttackBehavior().toString() + "" + monster.getName() + " for " + dmg + " damage.";
    	    	if(dmg == 0) dmgOut += monster.getName() + "'s attack missed.";
    	    	System.out.println(dmgOut);
        	}
        }

    	private static void damageExchange(ArrayList<DungeonCharacter> fightOrder) {

        	int dmg;
        	int attackTurns = fightOrder.get(1).getInitiative() / fightOrder.get(0).getInitiative();
        	if(attackTurns > 1) System.out.println("With enhanced agility, " + fightOrder.get(1).getName() + " attacks " + attackTurns + " times.");
        	if(attackTurns < 1) attackTurns = 1;
        	
        	for(int i = 0; i < attackTurns; i++) {
        		dmg = fightOrder.get(1).attack(fightOrder.get(0));
        		String dmgOut = "";
        		if(dmg > 0) dmgOut += fightOrder.get(1).getName() + "" + fightOrder.get(1).getAttackBehavior().toString() + "" + fightOrder.get(0).getName() + " for " + dmg + " damage.";
            	if(dmg == 0) dmgOut += fightOrder.get(1).getName() + "'s attack missed.";
        		System.out.println(dmgOut);
        	}
        	if(fightOrder.get(0).isAlive()) {
    	    	dmg = fightOrder.get(0).attack(fightOrder.get(1));
        		String dmgOut = "";
        		if(dmg > 0) dmgOut += fightOrder.get(0).getName() + "" + fightOrder.get(0).getAttackBehavior().toString() + "" + fightOrder.get(1).getName() + " for " + dmg + " damage.";
            	if(dmg == 0) dmgOut += fightOrder.get(0).getName() + "'s attack missed.";
        		System.out.println(dmgOut);
        	}
        }//end damageExchange
        
        private static void printHealthState(DungeonCharacter hero, DungeonCharacter monster) {
        	
        	System.out.println(hero.getName() + ": " + hero.getHitPoints() + "Hp | " + monster.getName() + ": " + monster.getHitPoints() + "Hp" );
    	  	String str = "";
        	if(hero.getHitPoints() < 1)
        		str += hero.getName() + " has been slain! Hope is lost as you fall to your knees, blood gushing from your neck. ";
    	  	if(monster.getHitPoints() < 1)
    	  		str += monster.getName() + " has been slain!";
    	  	if (!str.equals(""))
    	  		System.out.println(str);
    	  }//end printHealthState
    }