package gameCharacters;

public interface MosterFactory {

	public static Monster createSkeleton() {
		return new Skeleton();
	}
	public static Monster createOrc() {
		return new Orc();
	}
	public static Monster createGoblin() {
		return new Goblin();
	}
	public static Monster createBeholder() {
		return new Beholder();
	}
	public static Monster createBandit() {
		return new Bandit();
	}
	public static Monster createKoBold() {
		return new KoBold();
	}
	
}
