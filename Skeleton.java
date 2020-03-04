package gameCharacters;

public class Skeleton extends Monster{
    
	public Skeleton()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Sargath the Skeleton", 13, 2, 50, new LongSword());
    }//end constructor

	@Override
	public int attack(DungeonCharacter opponent) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Skeleton";
	}
}
