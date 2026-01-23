package birds;

public class StartBird {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow("Jack");
        Bird cuckoo = new Cuckoo("Cuckoo");
        Bird parrot = new Parrot("Kesha", "Тестовая песня");
//        Bird parrot1 = new Parrot("Fenia", "");
        sparrow.sing();
        cuckoo.sing();
        parrot.sing();
//        parrot1.sing();
    }
}
