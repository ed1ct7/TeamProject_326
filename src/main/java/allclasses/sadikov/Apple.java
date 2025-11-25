package allclasses.sadikov;

public class Apple {
    private String color;
    private double weight;
    private boolean isRipe;
    private String variety;
    private double sweetness;

    // Конструктор по умолчанию
    public Apple() {
        this.color = "red";
        this.weight = 150.0;
        this.isRipe = true;
        this.variety = "Gala";
        this.sweetness = 7.5;
    }

    // Конструктор с параметрами
    public Apple(String color, double weight, boolean isRipe, String variety, double sweetness) {
        this.color = color;
        this.weight = weight;
        this.isRipe = isRipe;
        this.variety = variety;
        setSweetness(sweetness);
    }

    public boolean canEat() {
        return isRipe && weight > 0;
    }

    public String getDescription() {
        String ripeness = isRipe ? "спелое" : "неспелое";
        return String.format("%s %s яблоко сорта '%s', весом %.1fг, сладость: %.1f/10",
                color, ripeness, variety, weight, sweetness);
    }

    public void takeBite(double biteWeight) {
        if (biteWeight <= 0) return;
        if (weight <= 0) return;

        if (biteWeight > weight) {
            weight = 0;
        } else {
            weight -= biteWeight;
        }
    }

    public String getSweetnessCategory() {
        if (sweetness >= 8.0) return "очень сладкое";
        else if (sweetness >= 6.0) return "сладкое";
        else if (sweetness >= 4.0) return "кисло-сладкое";
        else return "кислое";
    }

    public boolean isHeavierThan(Apple otherApple) {
        return this.weight > otherApple.getWeight();
    }

    public String getColor() { return color; }
    public double getWeight() { return weight; }
    public boolean isRipe() { return isRipe; }
    public String getVariety() { return variety; }
    public double getSweetness() { return sweetness; }

    public void setColor(String color) { this.color = color; }
    public void setWeight(double weight) { if (weight >= 0) this.weight = weight; }
    public void setRipe(boolean isRipe) { this.isRipe = isRipe; }
    public void setVariety(String variety) { this.variety = variety; }
    public void setSweetness(double sweetness) {
        if (sweetness >= 0.0 && sweetness <= 10.0) {
            this.sweetness = sweetness;
        }
    }

    @Override
    public String toString() {
        return getDescription();
    }
}