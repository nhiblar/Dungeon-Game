package gameCharacters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetUserInput {

	public enum heroRaces {
		AARAKOCRA, BUGBEAR, ELF, DRAGONBORN, DWARF, GNOME,
		GOLIATH, HALFELF, HUMAN, LIZARDFOLK, TRITON, TABAXI
	}
	
	public enum heroClasses{
		BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK,
		PALADIN, RANGER, ROGUE, SORCERER, WARLOCK, WIZARD
	}
	
	public static String getRaceFromUser() {
		
		Scanner kb;
		boolean repeat = false;
		String heroRace = "";
		
		while(repeat == false) {
			kb = new Scanner(System.in);
			System.out.println("Enter your hero's race: " +
						"\r\n(Discovered Races: Aarakocra, BugBear, Elf, Dragonborn, Dwarf, Gnome, Goliath, HalfElf, Human, Lizardfolk, Triton, Tabaxi)");
			heroRace = kb.nextLine().trim();
			if(heroRace.length() > 1)
				heroRace = heroRace.substring(0, 1).toUpperCase() + heroRace.substring(1).toLowerCase();
			try {
				for(heroRaces tempVal : heroRaces.values() ) {
				    if(heroRace.equalsIgnoreCase(tempVal.name()))
				        repeat = true;
				}
			} catch (InputMismatchException e ) {}
			
		}
		return heroRace;
	}//end getClassFromUser
	
		
	public static String getClassFromUser() {
		
		Scanner kb;
		boolean repeat = false;
		String heroClass = "";
		
		while(repeat == false) {
			kb = new Scanner(System.in);
			System.out.println("Enter your hero's class: "
					+ "\r\n(Known classes: Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer, Warlock, Wizard)");
			heroClass = kb.nextLine().trim();
			if(heroClass.length() > 1)
				heroClass = heroClass.substring(0, 1).toUpperCase() + heroClass.substring(1).toLowerCase();
			try {
				for(heroClasses tempVal : heroClasses.values() ) {
				    if(heroClass.equalsIgnoreCase(tempVal.name()))
				        repeat = true;
				}
			} catch (InputMismatchException e ) {}
		}
		return heroClass;
	}//end getClassFromUser
	
	public static String getNameFromUser() {
		
		String heroName = "";
		Scanner kb = new Scanner(System.in);
		
		while(heroName.isEmpty() || heroName.length() < 1) {
				System.out.println("Enter your hero's Name: ");
				heroName = kb.nextLine();
				heroName = heroName.trim();
		}
		heroName = heroName.substring(0, 1).toUpperCase() + heroName.substring(1).toLowerCase();
		kb.close();
		return heroName;
	}


	public static int getAttackFromUser(Hero hero) {
		
		System.out.println("Attack with your " + hero.getAttackBehavior().getName() + " (1) or " + hero.getSpecialAttack().getName() + " (2) ?");
		
		
		Scanner kb =new Scanner(System.in);
		return kb.nextInt();
		/*
		boolean repeat = false;
		String newNum = "";
		
		while(repeat == false) {
			kb = new Scanner(System.in);
			try {
				newNum = kb.nextLine();
				if(newNum.equals("1") || newNum.equals("2"))
					repeat = true;
			} catch (InputMismatchException e ) {}
		}
		return Integer.parseInt(newNum);
		*/
	}
	
}
