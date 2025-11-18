import allclasses.bartasevich.Toy;
import allclasses.sadikov.Apple;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        bartasevichMethod();

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

    public static void sadikovMethod(){
        Apple apple = new Apple("красное", 200.0, true, "Гала", 8.5);
        Apple apple2 = new Apple();
        System.out.println(apple.toString());
        System.out.println(apple2.toString());
    }

}