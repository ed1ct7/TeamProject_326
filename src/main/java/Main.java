import allclasses.bartasevich.Toy;
import allclasses.kovalenko.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        kovalenkoMethod();
        bartasevichMethod();

    }

    public static void tigranyan(){

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public static void kovalenkoMethod() {
        System.out.println("\nКОВАЛЕНКО");
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Барсик", "Кот", 2, 4.5);

        System.out.println("Животное 1: " + animal1.toString());
        System.out.println("Животное 2: " + animal2.toString());

        System.out.println("Животное 1 молодое: " + animal1.isYoung());
        System.out.println("Животное 2 молодое: " + animal2.isYoung());

        System.out.println("Животное 1 легкое: " + animal1.isLightWeight());
        System.out.println("Животное 2 легкое: " + animal2.isLightWeight());

        System.out.println("Животное 1 взрослое: " + animal1.isAdult());
        System.out.println("Животное 2 взрослое: " + animal2.isAdult());

        animal2.increaseAge();
        System.out.println("Возраст животного 2 увеличен: " + animal2.toString());

        animal2.changeWeight(5.2);
        System.out.println("Вес животного 2 изменен: " + animal2.toString());

        System.out.println("Животное 1 тяжелое: " + animal1.isHeavy());
        System.out.println("Животное 2 тяжелое: " + animal2.isHeavy());
    }

    public static void bartasevichMethod(){
        Toy toy = new Toy("Кукла Маша",2,6,100);
        Toy toy1 = new Toy();
        System.out.println(toy.ToString());
        System.out.println(toy1.ToString());

    }
}