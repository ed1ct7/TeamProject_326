package allclasses.mironenko;

public class Planet {
    private String name;
    private double radius; // в км
    private double mass;   // в кг
    private boolean hasAtmosphere;

    // Конструктор по умолчанию
    public Planet() {
        this.name = "Unknown";
        this.radius = 0;
        this.mass = 0;
        this.hasAtmosphere = false;
    }

    // Полный конструктор
    public Planet(String name, double radius, double mass, boolean hasAtmosphere) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.hasAtmosphere = hasAtmosphere;
    }

    // Геттеры
    public String getName() { return name; }
    public double getRadius() { return radius; }
    public boolean hasAtmosphere() { return hasAtmosphere; }

    // Сеттеры
    public void setName(String name) { this.name = name; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setMass(double mass) { this.mass = mass; }
    public void setHasAtmosphere(boolean hasAtmosphere) { this.hasAtmosphere = hasAtmosphere; }

    // Методы
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculateDensity() {
        if (radius == 0) return 0;
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius * 1000, 3); // в м³
        return mass / volume;
    }

    public boolean isGasGiant() {
        return mass > 5.0e25 && radius > 25000; // Условные значения
    }

    public String getPlanetInfo() {
        return String.format("Планета: %s, радиус: %.0f км, масса: %.2e кг, атмосфера: %s",
                name, radius, mass, hasAtmosphere ? "есть" : "нет");
    }

    @Override
    public String toString() {
        return getPlanetInfo();
    }
}