public class Sparrow extends Bird{
    private final String song = "чырык";

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(song);
    }
}
