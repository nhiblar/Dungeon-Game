package gameCharacters;

import attack.GreatSword;

public class Orc extends Monster{
	
	public Orc()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Lugger the Orc", 12, 1, 8, new GreatSword());

    }//end constructor

	@Override
	public String toString() {
		return "Orc";
	}


}
