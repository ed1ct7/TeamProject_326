import allclasses.bartasevich.Toy;
import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        tigranyanMethods();
        bartasevichMethod();
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
}