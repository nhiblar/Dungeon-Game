package gameCharacters;

public class Goblin extends Monster{
	
	public Goblin()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Gangar the Goblin", 7, 2, 50, 15);
		attackBehavior = new Shortsword();

    }//end constructor


}
