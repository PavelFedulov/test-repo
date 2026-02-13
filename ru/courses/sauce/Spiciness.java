public enum Spiciness {
    VERY_HOT("очень острый"),
    HOT("острый"),
    NOT_HOT("не острый");

    private final String title;

    Spiciness(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
