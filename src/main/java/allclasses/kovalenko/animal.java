package allclasses.kovalenko;

public class animal {
    private String name;
    private String species;
    private int age;
    private double weight;

    public animal() {
        name = "Неизвестно";
        species = "Неизвестно";
        age =0;
        weight = 0.0;
    }

    public animal(String name, String species,int age, double weight) {
       this.name = name;
       this.species = species;
       this.age = age;
       this.weight = weight;
    }
}
