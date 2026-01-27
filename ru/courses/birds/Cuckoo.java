import java.util.Random;

public class Cuckoo extends Bird{
    private final String song = "ку-ку ";

    public Cuckoo(String name) {
        super(name);
    }

    @Override
    public void sing() {
        int countSing = new Random().nextInt(10) + 1;
        String repeated = song.repeat(countSing);
        System.out.println(repeated);
    }
}
