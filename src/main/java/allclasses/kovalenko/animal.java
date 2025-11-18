package allclasses.kovalenko;

public class animal {
    private String name;
    private String species;
    private int age;
    private double weight;

    public animal() {
        name = "Неизвестно";
        species = "Неизвестно";
        age = 0;
        weight = 0.0;
    }

    public animal(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    // метод для вывода информации о животном
    public void printInfo() {
        System.out.println("Информация о животном:");
        System.out.println("Имя: " + name);
        System.out.println("Вид: " + species);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("----------------------");
    }

    // Метод для вывода информации в одну строку
    public void printShortInfo() {
        System.out.println(name + " (" + species + "), " + age + " лет, " + weight + " кг");
    }

    // Метод который возвращает строку с информацией
    public String getInfo() {
        return "Имя: " + name + ", Вид: " + species + ", Возраст: " + age + " лет, Вес: " + weight + " кг";
    }

    // Метод для красивого форматированного вывода
    public void displayInfo() {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         ИНФОРМАЦИЯ           ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ Имя:    " + padRight(name, 20) + " ║");
        System.out.println("║ Вид:    " + padRight(species, 20) + " ║");
        System.out.println("║ Возраст:" + padRight(age + " лет", 20) + " ║");
        System.out.println("║ Вес:    " + padRight(weight + " кг", 20) + " ║");
        System.out.println("╚══════════════════════════════╝");
    }

    // Вспомогательный метод для форматирования
    private String padRight(String text, int length) {
        return String.format("%-" + length + "s", text);
    }

    // Геттеры для доступа к полям
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}