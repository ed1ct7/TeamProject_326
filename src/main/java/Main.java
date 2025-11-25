import allclasses.bartasevich.Toy;
import allclasses.poruchikov.Ships;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        bartasevichMethod();
        poruchikovMethod();

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

    public static void poruchikovMethod() {
        System.out.println("\n~~~~~\nПоручиков");
        Ships ship = new Ships("Титаник", "Пассажирский", 1912, 52310.0);

        ship.printShipInfo();
        System.out.println("Возраст корабля: " + ship.calculateAge() + " лет");
        System.out.println("Старый корабль (>20 лет): " + ship.OldShip());
        System.out.println("Эффективность топлива: " + ship.calculateFuelEfficiency() + " км/т\n~~~~~\n");
    }

}