package gameCharacters;

public class Orc extends Monster{
	
	public Orc()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("lugger the Orc", 15, 1, 50, 13);
		attackBehavior = new Greatsword();

    }//end constructor


}
