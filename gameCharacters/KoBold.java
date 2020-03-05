package gameCharacters;

public class KoBold extends Monster{
	
	public KoBold()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Kronk the KoBold", 10, 4, 10, new Dagger());

    }//end constructor

	@Override
	public String toString() {
		return "KoBold";
	}

}
