package gameCharacters;

import attack.LongSword;

public class Skeleton extends Monster{
    
	public Skeleton()
	{
		super("Sargath the Skeleton", 10, 2, 10, new LongSword());
    }//end constructor

	@Override
	public String toString() {
		return "Skeleton";
	}
}
