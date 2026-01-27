public class StartBird {
    public static void main(String[] args) {
        Bird sparrow1 = new Sparrow("Jack");
        Bird cuckoo1 = new Cuckoo("Cuckoo");
        Bird parrot1 = new Parrot("Kesha", "Свободу попугаям");
        Bird sparrow2 = new Sparrow("Pete");
        Bird cuckoo2 = new Cuckoo("Cuckooshka");
        Bird parrot2 = new Parrot("Billy", "Вы не были на Гаити?");

        Bird.singAll(sparrow1, cuckoo1, parrot1, sparrow2, cuckoo2, parrot2);
    }
}
