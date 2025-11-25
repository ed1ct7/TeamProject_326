package allclasses.ponomaryova;

public class Dogs {
    private String breed;
    private int year;
    private String name;

    public Dogs(String breed, int year, String name){
        this.breed = breed;
        this.year = year;
        this.name = name;
    }

    public String showDog(){
        return "Порода собаки: " + breed + ", Год рождения собаки: " + year + ", кличка собаки: " + name;
    }

    public String howAge(){
        int age = 2025 - this.year;
        return "На данный момент собаке " + age + " лет";
    }
}
