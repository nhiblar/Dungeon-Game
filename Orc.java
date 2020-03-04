package gameCharacters;

public class Orc extends Monster{
	
	public Orc()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("lugger the Orc", 15, 1, 50, new GreatSword());

    }//end constructor

	@Override
	public int attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Orc";
	}


}
