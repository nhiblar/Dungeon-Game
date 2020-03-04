package gameCharacters;

public class KoBold extends Monster{
	
	public KoBold()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Kronk the KoBold", 5, 2, 50, new Dagger());

    }//end constructor

	@Override
	public int attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		return 0;
	}


}
