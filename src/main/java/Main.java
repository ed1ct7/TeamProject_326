import allclasses.bartasevich.Toy;
import allclasses.sadekov.ComputerComponent;
import allclasses.sadekov.E_ComponentSpecs;
import allclasses.sadekov.E_ComponentTypes;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        bartasevichMethod();
        sadekovMethod();
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

    public static void sadekovMethod(){
        System.out.print("=================================");
        System.out.print("Садеков");
        ComputerComponent component = new ComputerComponent();
        component.PrintMainInfo();
        component.PrintSpecsInfo();
        ComputerComponent component1 = new ComputerComponent("NVIDIA GT 710", "Легенда, в описании не нуждается",
                "Palit", 100.0, E_ComponentTypes.GraphicsCard, Map.of(E_ComponentSpecs.MemoryVolume, 1024.0));
        component1.PrintMainInfo();
        component1.PrintSpecsInfo();
        component1.AddEditSpecInfo(E_ComponentSpecs.MemoryVolume, 2048.0);
        component1.PrintSpecsInfo();
        System.out.print(component1.CalculateFreeMemory(2047));
        System.out.print("\n");
        System.out.print(component1.GetRublePrice());
        System.out.print("=================================");
    }
}