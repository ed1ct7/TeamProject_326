package allclasses.poruchikov;

public class Ships {
    private String name;
    private String type;
    private int year;
    private double weight;

    public Ships() {
        name = "Аврора";
        type = "Неит";
        year = 2000;
        weight = 0.0;
    }

    public Ships(String name, String type, int year, double weight) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.weight = weight;

    }

    public int calculateAge() { return 2025 - year;}

    public boolean OldShip() {
        return calculateAge() > 20; }

    public void printShipInfo() {
        System.out.println("Корабль: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Год постройки: " + year);
        System.out.println("Вес: " + weight + " тонн");
    }

    public double calculateFuelEfficiency() {
        double baseEfficiency = 100; // км/т топлива
        double agePenalty = calculateAge() * 0.5;
        double weightPenalty = weight * 0.001;
        double typeBonus = getTypeEfficiencyBonus();

        return Math.max(10, baseEfficiency - agePenalty - weightPenalty + typeBonus);
    }

    private double getTypeEfficiencyBonus() {

        switch (type.toLowerCase()) {
            case "танкер":
                return 5.0;
            case "контейнеровоз":
                return 10.0;
            case "пассажирский":
                return -2.0;
            default:
                return 0.0;
        }
    }
}