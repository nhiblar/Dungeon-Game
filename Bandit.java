package gameCharacters;

public class Bandit extends Monster{
	
	public Bandit()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Jerry the Bandit", 11, 1, 50, 12);
		attackBehavior = new Shortsword();

    }//end constructor


}
