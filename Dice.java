import java.util.Random;

public class Dice {

    public static int d20() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public static int d12() {
        Random random = new Random();
        return random.nextInt(12) + 1;
    }

    public static int d10() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static int d8() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

    public static int d6() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int d4() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
