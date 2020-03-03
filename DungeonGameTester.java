package DungeonGame;

public class DungeonGameTester {
	
	public static void main(String[] args) {
		
		HeroFactory heroFactory = new HeroFactory();
		Hero newHero = heroFactory.newHero(GetUserInput.getRaceFromUser(), GetUserInput.getClassFromUser(), GetUserInput.getNameFromUser());
		newHero.printHero();
		
	}//end main
}//end class
