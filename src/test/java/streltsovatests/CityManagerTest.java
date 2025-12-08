package streltsovatests;

import allclasses.streltsova.CityManager;
import org.junit.Test;
import static org.junit.Assert.*;
public class CityManagerTest {

    @Test
    public void testAddCity()
    {
        CityManager manager = new CityManager();

        assertTrue(manager.addCity("Москва"));
        assertTrue(manager.addCity("Санкт-Петербург"));
        assertFalse(manager.addCity("Москва"));

        assertEquals(2, manager.getCitiesCount());
        assertEquals(2, manager.getAddedCitiesCount());

    }

    @Test
    public void testRemoveCity()
    {
        CityManager manager = new CityManager();
        manager.addCity("Казань");
        manager.addCity("Новосибирск");

        assertTrue(manager.removeCity("Казань"));
        assertFalse(manager.removeCity("Екатеринбург"));

        assertEquals(1, manager.getCitiesCount());
        assertEquals(1, manager.getAddedCitiesCount());
    }

    @Test
    public void testContainsCity()
    {
        CityManager manager = new CityManager();
        manager.addCity("Сочи");

        assertTrue(manager.containsCity("Сочи"));
        assertFalse(manager.containsCity("Владивосток"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEmptyCity()
    {
        CityManager manager = new CityManager();
        manager.addCity("");
    }

    @Test
    public void testClearCities()
    {
        CityManager manager = new CityManager();
        manager.addCity("Калининград");
        manager.addCity("Владивосток");

        manager.clearCities();

        assertEquals(0, manager.getCitiesCount());
        assertEquals(0, manager.getAddedCitiesCount());

        assertTrue(manager.isEmpty());
    }

    @Test
    public void testGetAllCities()
    {
        CityManager manager = new CityManager();
        manager.addCity("Москва");
        manager.addCity("Санкт-Петербург");

        java.util.List<String> cities = manager.getAllCities();

        assertEquals(2, cities.size());
        assertTrue(cities.contains("Москва"));
        assertTrue(cities.contains("Санкт-Петербург"));
    }



}
