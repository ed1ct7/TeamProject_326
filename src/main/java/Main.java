import allclasses.bartasevich.Toy;
import allclasses.gulyaev.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        bartasevichMethod();
        gulyaevMethod();
    }

    public static void tigranyan(){

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public static void bartasevichMethod(){
        Toy toy = new Toy("Кукла Маша",2,6,100);
        Toy toy1 = new Toy();
        System.out.println(toy.ToString());
        System.out.println(toy1.ToString());

    }
    public static void gulyaevMethod(){
        Rectangle rec1 = new Rectangle(1, 2);
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle(10, 5);
        int square1 = rec1.Square();
        int perimeter = rec1.Perimeter();
        System.out.println("Площадь прямоугольника: " + square1);
        System.out.println("Периметр треугольника: " + perimeter);
    }
}