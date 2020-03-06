package main;

import gameCharacters.*;

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
	    		 " has base stats of: \n" + hero.getHitPoints() + "HP " + hero.getAC() + "AC " + hero.getInitiative() + "Initiative");
	    	System.out.println(hero.getName() + " is attacked by a " + enemy.toString() + "." );
	    	
	    	combat(enemy);
	    	again = GetUserInput.getPlayAgainUser();
	    }
    	System.out.println("- - -   G A M E   O V E R   - - -");
    }

    private static void combat(DungeonCharacter monster) {
    	
    	int dmg;
    	
    	while (hero.isAlive() && monster.isAlive()) {
        	
    		//need to validate data from user in getAttackFromUser()
    		System.out.println("Attack with your " + hero.getAttackBehavior().getName() + " (1) or " + hero.getSpecialAttack().getName() + " (2) ?");
			int attackType = GetUserInput.getAttackFromUser();
    		
        	if(hero.getAC() >= monster.getAC()) {
        		if(attackType == 1) {
        			dmg = hero.attack(monster);
        			System.out.println(hero.getName() + " " + hero.getAttackBehavior().toString() + " " + monster.getName() + " for " + dmg + " damage");
                }else {
        			dmg = hero.specialAttack(monster);
        			System.out.println(hero.getName() + " " + hero.getSpecialAttack() + " " + monster.getName() + " for " + dmg + " damage");
                }
        		if(monster.isAlive()) {
        		dmg = monster.attack(hero);
            	System.out.println(monster.getName() + " " + monster.getAttackBehavior().toString() + " " + hero.getName() + " for " + dmg + " damage");
        		}
        	}else {
            	dmg = monster.attack(hero);
            	System.out.println(monster.getName() + " " + monster.getAttackBehavior().toString() + " " + hero.getName() + " for " + dmg + " damage");
            	if(hero.isAlive()) {
	            	if(attackType == 1) {
	        			dmg = hero.attack(monster);
	        			System.out.println(hero.getName() + " " + hero.getAttackBehavior().toString() + " "+ monster.getName() + " for " + dmg + " damage");
	                }else {
	        			dmg = hero.specialAttack(monster);
	        			System.out.println(hero.getName() + " " + hero.getSpecialAttack() + " " + monster.getName() + " for " + dmg + " damage");
	                }
            	}
            }//end damage exchange
        	
        	System.out.println(hero.getName() + ": " + hero.getHitPoints() + "Hp | " + monster.getName() + ": " + monster.getHitPoints() + "Hp \r\n" );
        }//end while
    	if(hero.getHitPoints() < 0) {
    		System.out.println(hero.getName() + " has been slain! Game Over.");
    	}else {
    		System.out.println(monster.getName() + " has been slain! You survived this battle.");
    	}
    		
    	
    	
    }//end combat
}
