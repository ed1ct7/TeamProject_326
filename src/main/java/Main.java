import allclasses.buldakov.*;
import allclasses.mironenko.Planet;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        mironenkoMethod();
    }

    public static void mironenkoMethod() {
        System.out.println("\n=== Метод Mironenko (Планеты) ===");

        Planet earth = new Planet("Земля", 6371, 5.97e24, true);
        Planet mars = new Planet("Марс", 3389.5, 6.39e23, false);
        Planet jupiter = new Planet("Юпитер", 69911, 1.898e27, true);

        System.out.println(earth);
        System.out.println(mars);
        System.out.println(jupiter);

        System.out.printf("Площадь поверхности Земли: %.2e км²%n", earth.calculateSurfaceArea());
        System.out.printf("Плотность Марса: %.2f кг/м³%n", mars.calculateDensity());
        System.out.println("Земля - газовый гигант? " + earth.isGasGiant());
        System.out.println("Юпитер - газовый гигант? " + jupiter.isGasGiant());
        System.out.println("У Марса есть атмосфера? " + mars.hasAtmosphere());
    }
}