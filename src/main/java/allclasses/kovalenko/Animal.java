package allclasses.kovalenko;

public class Animal {
    private String name;
    private String species;
    private int age;
    private double weight;

    public Animal() {
        name = "Неизвестно";
        species = "Неизвестно";
        age = 0;
        weight = 0.0;
    }

    public Animal(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return "Вид: " + species + ", имя: " + name + ", возраст: " + age + " лет" +
                ", вес: " + weight + " кг";
    }

    // определение является ли животное молодым
    public boolean isYoung() {
        return age <= 3;
    }

    // определение является ли животное легким
    public boolean isLightWeight() {
        return weight <= 5.0;
    }

    // определение является ли животное взрослым
    public boolean isAdult() {
        return age >= 3;
    }

    // увеличение возраста на 1 год
    public void increaseAge() {
        age++;
    }

    // изменение веса животного
    public void changeWeight(double newWeight) {
        if (newWeight >= 0) {
            weight = newWeight;
        }
    }

    // определение является ли животное тяжелым
    public boolean isHeavy() {
        return weight >= 50.0;
    }
}