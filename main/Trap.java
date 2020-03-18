package main;

import gameCharacters.Hero;

public class Trap {

	public static void trap(Hero hero) {
		
		int n = Dice.d4();
		if(n == 1) System.out.println("As you enter this room, spikes fly out of the walls...");
		if(n == 2) System.out.println("As you enter this room, the ground starts to give way...");
		if(n == 3) System.out.println("As you enter this room, the ceiling aboves you start to cumble...");
		if(n == 4) System.out.println("As you enter this room, flames shoot towards you...");
		
		if(hero.getInitiative() > Dice.d4() - 1) {
			System.out.println("but your innate reflexes take over as you jump to saftey.");
		} else {
			int dmg = Dice.d4() + 2;
			System.out.println("and you take " + dmg + " damage.");
			hero.subtractHitPoints(dmg);
			System.out.println("Current health is: " + hero.getHitPoints() + " HP");
		}
	}
}
