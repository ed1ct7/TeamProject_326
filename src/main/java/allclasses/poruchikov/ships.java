package allclasses.poruchikov;

public class ships {
    private String name;
    private String type;
    private int year;
    private double weight;

    public ships() {
        name = "Аврора";
        type = "Неит";
        year = 2000;
        weight = 0.0;
    }

    public ships(String name, String type, int year, double weight) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.weight = weight;
    }
}
