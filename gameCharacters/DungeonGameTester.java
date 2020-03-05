package gameCharacters;

public class DungeonGameTester {
	
	public static void main(String[] args) {
		
		HeroFactory heroFactory = new HeroFactory();
		Hero theHero = heroFactory.newHero(GetUserInput.getRaceFromUser(), GetUserInput.getClassFromUser(), GetUserInput.getNameFromUser());
		
		
	}//end main
}//end class
