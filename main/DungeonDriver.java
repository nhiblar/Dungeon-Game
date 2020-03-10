package main;

import java.util.ArrayList;
import java.util.Collections;

import gameCharacters.*;
import specialAttack.*;

public class DungeonDriver {
	
	private static Hero hero;
	
    public static void main(String[] args) {
    	
    	String again = "y";
    	while(again.equals("y")){
	    	
	    	HeroFactory heroFactory = new HeroFactory();
	        hero = heroFactory.newHero(GetUserInput.getRaceFromUser(), GetUserInput.getClassFromUser(), GetUserInput.getNameFromUser());
	        MonsterFactory monsterFactory = new MonsterFactory();
	    	Monster enemy = monsterFactory.newMonster(Dice.d6());
	    	
	    	System.out.println(hero.getName() + " the " + hero.getCharRace() + ", " + hero.getCharClass() +
	    	" has base stats of: \n" + hero.getHitPoints() + " HP, " + hero.getAC() + " AC, " + hero.getInitiative() + " Initiative");
	    	System.out.println(hero.getName() + " is attacked by a " + enemy.toString() + "." );
	    	
	    	combat(enemy);
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
    
    private static void healTurn(Hero hero, DungeonCharacter monster) {
    	if(hero.getMana() < 1)
    		System.out.println("You have run out of mana and can no longer cast " + hero.getAttackBehavior().getName());
    	else {
    	hero.attack(hero);
    	hero.setMana(hero.getMana() - 1);
    	monster.attack(hero);
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
    	
    	System.out.println(hero.getName() + ": " + hero.getHitPoints() + "Hp | " + monster.getName() + ": " + monster.getHitPoints() + "Hp \r\n" );
	  	String str = "";
    	if(hero.getHitPoints() < 1)
    		str += hero.getName() + " has been slain! Hope is lost as you fall to your knees, blood gushing from your neck. ";
	  	if(monster.getHitPoints() < 1)
	  		str += monster.getName() + " has been slain!";
	  	if (!str.equals(""))
	  		System.out.println(str);
	  }//end printHealthState
}
