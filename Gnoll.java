package gameCharacters;

public class Gnoll extends Monster{
	public Gnoll()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Monica the Gnoll", 22, 1, 50, 15);
		attackBehavior = new Club();

    }//end constructor



}
