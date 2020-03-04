package gameCharacters;

public class Goblin extends Monster{
	
	public Goblin()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Gangar the Goblin", 7, 2, 50, new ShortSword());

    }//end constructor

	@Override
	public int attack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		return 0;
	}


}
