package gameCharacters;

public class Goblin extends Monster{
	
	public Goblin()
	{
		//String name, int hitPoints, int initiative, int damageDie, int ac
		super("Gangar the Goblin", 7, 2, 50, new ShortSword());

    }//end constructor

	@Override
	public int attack(DungeonCharacter enemy) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Goblin";
	}

}
