package gameCharacters;

public class Bandit extends Monster{
	
	public Bandit()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Jerry the Bandit", 11, 1, 50, new ShortSword());

    }//end constructor

	@Override
	public int attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		return 10;
	}
	
	@Override
	public String toString() {
		return "Bandit";
	}


}
