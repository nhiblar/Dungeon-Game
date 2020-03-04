package gameCharacters;

public class DungeonDriver {
	
	private static Hero hero;
	
    public static void main(String[] args) {
    	
    	HeroFactory heroFactory = new HeroFactory();
        //hero = heroFactory.newHero(GetUserInput.getRaceFromUser(), GetUserInput.getClassFromUser(), GetUserInput.getNameFromUser());
    	hero = heroFactory.newHero("Elf", "Bard", "Norp");
    	MonsterFactory monsterFactory = new MonsterFactory();
    	
    	Monster enemy = monsterFactory.newMonster(1);
    	//Monster enemy = monsterFactory.newMonster(Dice.d6());
    	
    	System.out.println(hero.getName() + " the " + hero.getCharRace() + ", " + hero.getCharClass() +
    		 " has base stats of: \n" + hero.getHitPoints() + "HP " + hero.getAC() + "AC " + hero.getInitiative() + "Initiative");
    	System.out.println(hero.getName() + " is attacked by a " + enemy.toString() + "!" );
    	combat(enemy);
    }

    private static void combat(DungeonCharacter monster) {
        while (hero.isAlive() && monster.isAlive()) {
        	
        	if(hero.getAC() >= monster.getAC()) {
            	int dmg = hero.attack(monster);
            	System.out.println(hero.getName() + " " + hero.attackBehavior.toString() + " " + monster.getName() + " for " + dmg + "damage");
            	dmg = monster.attack(hero);
            	System.out.println(monster.getName() + " " + monster.attackBehavior.toString() + " " + hero.getName() + " for " + dmg + "damage");
            }else {
            	int dmg = monster.attack(hero);
            	System.out.println(monster.getName() + " " + monster.attackBehavior.toString() + " " + hero.getName() + " for " + dmg + "damage");
            	dmg = hero.attack(monster);
            	System.out.println(hero.getName() + " " + hero.attackBehavior.toString() + " " + monster.getName() + " for " + dmg + "damage");
            }
        	
        }//end while
    }//end combat
}
