package allclasses.kazakova;

public class Coffee {
    private String type;
    private int sugar;

    public Coffee(String type, int sugar) {
        this.type = type;
        this.sugar = sugar;
    }

    public String getDescription() {
        return "Кофе: " + type + ", сахара: " + sugar + " ложек.";
    }

    public void addSugar(int amount) {
        this.sugar += amount;
    }
}

