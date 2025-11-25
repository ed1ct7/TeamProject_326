package poruchikov_tests;

import allclasses.poruchikov.Ships;
import org.junit.Assert;
import org.junit.Test;

public class ShipsTests {

    @Test
    public void defaultConstructorTest() {
        Ships ship = new Ships();
        Assert.assertEquals(25, ship.calculateAge());
        Assert.assertTrue(ship.OldShip()); // 25 > 20
    }

    @Test
    public void parameterizedConstructorTest() {
        Ships ship = new Ships("Титаник",
                "Пассажирский",
                1912, 52310.0);
        Assert.assertEquals(113, ship.calculateAge());
        Assert.assertTrue(ship.OldShip());
    }

    @Test
    public void calculateAgeTest() {
        Ships ship = new Ships("Тестовый", "Танкер", 2010, 50000.0);
        Assert.assertEquals(15, ship.calculateAge()); // 2025 - 2010 = 15
    }

    @Test
    public void oldShipTrueTest() {
        Ships ship = new Ships("Старый корабль", "Танкер", 1990, 40000.0);
        Assert.assertTrue(ship.OldShip()); 
    }

    @Test
    public void oldShipFalseTest() {
        Ships ship = new Ships("Новый корабль", "Контейнеровоз", 2020, 60000.0);
        Assert.assertFalse(ship.OldShip());
    }

    @Test
    public void calculateFuelEfficiencyTankerTest() {
        Ships ship = new Ships("Танкер", "Танкер", 2020, 50000.0);
        double efficiency = ship.calculateFuelEfficiency();
        // Расчет: 100 - (5 * 0.5) - (50000 * 0.001) + 5.0
        // = 100 - 2.5 - 50 + 5 = 52.5
        Assert.assertEquals(52.5, efficiency, 0.1);
    }
}