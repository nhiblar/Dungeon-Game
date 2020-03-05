package gameCharacters;

public interface MosterFactory {

    static Monster createSkeleton() {
        return new Skeleton();
    }

    static Monster createOrc() {
        return new Orc();
    }

    static Monster createGoblin() {
        return new Goblin();
    }

    static Monster createBeholder() {
        return new Gnoll();
    }

    static Monster createBandit() {
        return new Bandit();
    }

    static Monster createKoBold() {
        return new KoBold();
    }

}
