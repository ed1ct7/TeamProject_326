import allclasses.bartasevich.Toy;
import allclasses.rozhina.Phone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        bartasevichMethod();
        rozhinaMethod();

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
    public static void rozhinaMethod() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        System.out.println("\nТелефон 1: " + phone1.ToString());
        System.out.println("Телефон 2: " + phone2.ToString());
        System.out.println("Дешевый ли первый телефон - " + phone1.isCheapPrice());
        System.out.println("Дешевый ли второй телефон - " + phone2.isCheapPrice());
        System.out.println("Мало ли памяти у первого телефона - " + phone1.isLittleMemory());
        System.out.println("Мало ли памяти у второго телефона - " + phone2.isLittleMemory());
        System.out.println("Низкий ли заряд у первого телефона - " + phone1.isLowBattery());
        System.out.println("Низкий ли заряд у второго телефона - " + phone2.isLowBattery());
        phone1.chargeToFull();
        System.out.println("Первый телефон полностью заряжен, заряд: " + phone1.getBattery());
        phone2.chargeToFull();
        System.out.println("Второй телефон полностью заряжен, заряд: " + phone2.getBattery());
        phone1.dischargeFully();
        System.out.println("Первый телефон полностью разряжен, заряд: " + phone1.getBattery());
        phone2.dischargeFully();
        System.out.println("Второй телефон полностью разряжен, заряд: " + phone2.getBattery());
    }
}