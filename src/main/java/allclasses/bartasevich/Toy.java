package allclasses.bartasevich;

public class Toy {
    private String name;
    private  int ageLow;
    private int ageHigh;
    private float price;

    public Toy(){
       name = "Игрушка";
        ageLow = 1;
        ageHigh = 99;
        price = 1;
    }
    public Toy(String name, int ageLow, int ageHigh, float price){
        this.name = name;
        this.ageLow = ageLow;
        this.ageHigh = ageHigh;
        this.price = price;
    }

    public String ToString(){
        return name + " от " + ageLow + " до " + ageHigh + " цена " + price;
    }


}
