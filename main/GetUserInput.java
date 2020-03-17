package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetUserInput {

	public enum heroRaces {
		AARAKOCRA, BUGBEAR, ELF, DRAGONBORN, DWARF, GNOME,
		GOLIATH, HALFELF, HUMAN, LIZARDFOLK, TRITON, TABAXI, FROGLOK
	}
	
	public enum heroClasses{
		BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK,
		PALADIN, RANGER, ROGUE, SORCERER, WARLOCK, WIZARD, NECROMANCER
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
		return heroName;
	}

	public static int getAttackFromUser() {

		String choice = "0";
		Scanner kb = new Scanner(System.in);
		
		while(!(choice.equals("1") || choice.equals("2"))) {
				choice = kb.nextLine();
				choice = choice.trim();
		}//end while
		int num = Integer.parseInt(choice);
		return num;
	}
	
	
	public static String getPlayAgainUser() {
		
		String again = "";
		Scanner kb = new Scanner(System.in);
		
		while(!(again.equals("y") || again.equals("n"))) {
				System.out.println("Play again? Yes (y) or No (n)?");
				again = kb.nextLine();
				again = again.trim().toLowerCase();
				if(again.equals("yes"))
					again = "y";
				if(again.equals("no"))
					again = "n";
		}
		return again;
	}
   
   public static String getYesOrNoResponse(){
      String response = "";
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Yes (y) or No (n)?");
      response = kb.nextLine();
      response = response.toUpperCase();
      while(!(response.equals("Y") || response.equals("N"))){
         System.out.print("Yes (y) or No (n)?");
         response = kb.nextLine();
         response = response.toUpperCase();
      }
      return response;
   }
   
   public static String getPotionResponse(){
      String response = "";
      Scanner kb = new Scanner(System.in);
      
      response = kb.nextLine();
      response = response.toUpperCase();
      
      while(!(response.equals("VP") || response.equals("HP") || response.equals("MP"))){
         System.out.print("Invalid response: please enter VP for Vision Potion, HP for Heal Potion, \nor MP for Mana Potion if you have that potion");
         
         response = kb.nextLine();
         response = response.toUpperCase();
         
      }
      return response;
   }
	
}
