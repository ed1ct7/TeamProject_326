package allclasses.streltsova;

import java.util.ArrayList;
import java.util.List;
public class CityManager {
    private List<String> cities;
    private int addedCitiesCount;

    public CityManager()
    {
        this.cities = new ArrayList<>();
        this.addedCitiesCount = 0;

    }

    public boolean addCity(String cityName)
    {
        if (cityName == null || cityName.trim().isEmpty())
        {
            throw new IllegalArgumentException("Название города не может быть пустым");

        }

        if(!cities.contains(cityName))
        {
            cities.add(cityName);
            addedCitiesCount++;
            return true;
        }
        return false;
    }

    public boolean removeCity(String cityName)
    {
        boolean removed = cities.remove(cityName);
        if (removed)
        {
            addedCitiesCount--;
        }
        return removed;
    }

    public boolean containsCity(String cityName)
    {
        return cities.contains(cityName);
    }

    public int getCitiesCount()
    {
        return cities.size();
    }

    public List<String> getAllCities()
    {
        return new ArrayList<>(cities);
    }

    public void clearCities() {
        cities.clear();
        addedCitiesCount = 0;
    }

    public int getAddedCitiesCount() {
        return addedCitiesCount;
    }

    public boolean isEmpty() {
        return cities.isEmpty();
    }

    public static void streltsovaMethod() {

        CityManager cityManager = new CityManager();

        // Добавляем города
        System.out.println("\nДобавляем города:");
        cityManager.addCity("Москва");
        cityManager.addCity("Санкт-Петербург");
        cityManager.addCity("Казань");
        cityManager.addCity("Новосибирск");

        boolean added = cityManager.addCity("Москва");
        System.out.println("Москва добавлена повторно: " + added);

        System.out.println("\nСписок городов:");
        for (String city : cityManager.getAllCities()) {
            System.out.println("- " + city);
        }

        System.out.println("Всего городов: " + cityManager.getCitiesCount());
        System.out.println("Добавлено городов: " + cityManager.getAddedCitiesCount());

        System.out.println("\nПроверка наличия городов:");
        System.out.println("Есть ли Сочи: " + cityManager.containsCity("Сочи"));
        System.out.println("Есть ли Казань: " + cityManager.containsCity("Казань"));

        System.out.println("\nУдаляем Казань:");
        boolean removed = cityManager.removeCity("Казань");
        System.out.println("Казань удалена: " + removed);
        System.out.println("Городов осталось: " + cityManager.getCitiesCount());

        System.out.println("\nОчищаем список городов:");
        cityManager.clearCities();
        System.out.println("Список пуст: " + cityManager.isEmpty());
        System.out.println("Городов: " + cityManager.getCitiesCount());

        System.out.println("\n=== Демонстрация завершена ===");
    }
}
