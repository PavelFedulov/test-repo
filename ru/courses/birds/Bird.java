public abstract class Bird {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void sing();

    public static void singAll(Bird... birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }
}
