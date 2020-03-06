package gameCharacters;

public class MonsterFactory {

	public Monster newMonster(int n) {
		
		switch(n) {
			case 1:
				return new Skeleton();
			case 2:
				return new Orc();
			case 3:
				return new Goblin();
			case 4:
				return new Gnoll();
			case 5:
				return new Bandit();
			case 6:
				return new KoBold();
		}
		System.out.println("Defying the creator, a Beholder attacks");
		return new Beholder();
		
	}
}
