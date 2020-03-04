package gameCharacters;

public class Skeleton extends Monster{
    
	public Skeleton()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Sargath the Skeleton", 13, 2, 50, new LongSword());
    }//end constructor

	@Override
	public int attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		return 0;
	}

}
