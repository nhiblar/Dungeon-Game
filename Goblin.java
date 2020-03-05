package gameCharacters;

public class Goblin extends Monster{
	
	public Goblin()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Gangar the Goblin", 7, 3, 7, new ShortSword());

    }//end constructor

	
	@Override
	public String toString() {
		return "Goblin";
	}

}
