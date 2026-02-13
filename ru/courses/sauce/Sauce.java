public class Sauce {
    private final String name;
    private final Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        if (spiciness == null) {
            throw new IllegalArgumentException("Острота не может быть пустой");
        }
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString(){
        return "Соус " + name + ": " + spiciness.getTitle();
    }
}
