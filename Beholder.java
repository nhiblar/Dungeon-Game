package gameCharacters;

public class Beholder extends Monster{
	public Beholder()
	{
		super("Monica the Beholder", 25, 5, 25, new Club());

    }//end constructor

	@Override
	public String toString() {
		return "Beholder";
	}

}
