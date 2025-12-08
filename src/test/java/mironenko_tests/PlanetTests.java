package mironenko_tests;

import allclasses.mironenko.Planet;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetTests {
    @Test
    public void testPlanetCreation() {
        Planet earth = new Planet("Земля", 6371, 5.97e24, true);

        assertEquals("Земля", earth.getName());
        assertEquals(6371, earth.getRadius(), 0.001);
        assertTrue(earth.hasAtmosphere());
    }

    @Test
    public void testSurfaceArea() {
        Planet earth = new Planet("Земля", 6371, 5.97e24, true);
        double expected = 4 * Math.PI * 6371 * 6371;
        assertEquals(expected, earth.calculateSurfaceArea(), 0.001);
    }

    @Test
    public void testDensity() {
        Planet earth = new Planet("Земля", 6371, 5.97e24, true);
        // Примерная плотность Земли ~5515 кг/м³
        double density = earth.calculateDensity();
        assertTrue(density > 5000 && density < 6000);
    }

    @Test
    public void testIsGasGiant() {
        Planet earth = new Planet("Земля", 6371, 5.97e24, true);
        Planet jupiter = new Planet("Юпитер", 69911, 1.898e27, true);

        assertFalse(earth.isGasGiant());
        assertTrue(jupiter.isGasGiant());
    }

    @Test
    public void testToString() {
        Planet earth = new Planet("Земля", 6371, 5.97e24, true);
        String expected = "Планета: Земля, радиус: 6371 км, масса: 5.97e+24 кг, атмосфера: есть";
        assertEquals(expected, earth.toString());
    }
}