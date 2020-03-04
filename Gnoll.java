package gameCharacters;

public class Gnoll extends Monster{
	public Gnoll()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Monica the Gnoll", 12, 2, 8, new Club());

    }//end constructor

	@Override
	public String toString() {
		return "Gnoll";
	}


}
