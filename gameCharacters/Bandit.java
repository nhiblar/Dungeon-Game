package gameCharacters;

import attack.ShortSword;

public class Bandit extends Monster{
	
	public Bandit()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Jerry the Bandit", 10, 1, 13, new ShortSword());

    }//end constructor

	@Override
	public String toString() {
		return "Bandit";
	}


}
