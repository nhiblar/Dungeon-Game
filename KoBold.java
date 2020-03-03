package gameCharacters;

public class KoBold extends Monster{
	
	public KoBold()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Kronk the KoBold", 5, 2, 50, 12);
		attackBehavior = new Dagger();

    }//end constructor


}
