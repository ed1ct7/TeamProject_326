import allclasses.bartasevich.Toy;
import allclasses.kazakova.Coffee;
import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;
import allclasses.buldakov.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        tigranyanMethods();
        bartasevichMethod();
        kazakova();
        buldakovMethod();

    }

    public static void tigranyanMethods(){
        Tonality tonality = new Tonality(Notes.A, Scales.MINOR);
        Notes[] scale = tonality.getScaleNotes();
        System.out.println("\nA minor scale notes");
        for (Notes note : scale) {
            System.out.println(note.toString());
        }
    }

    public static void bartasevichMethod(){
        Toy toy = new Toy("Кукла Маша",2,6,100);
        Toy toy1 = new Toy();
        System.out.println(toy.ToString());
        System.out.println(toy1.ToString());

    }

    public static void kazakova(){
        Coffee coffee = new Coffee("Раф", 1);
        System.out.println("\nКазакова, "+ coffee.getCoffee());
    public static void buldakovMethod() {
        Vector vec1 = new Vector();
        Vector vec2 = new Vector(1.5,2);
        vec1.setX(4);
        vec1.setY(3);
        System.out.println("\nВектор 1: "+vec1.ToString());
        System.out.println("Вектор 2: "+vec2.ToString());
    }
}