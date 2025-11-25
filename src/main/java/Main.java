import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.PositionRepository;
import allclasses.petrenko.repository.SchoolWorkerRepository;
import allclasses.bartasevich.Toy;
import allclasses.romanova.Book;
import allclasses.sadikov.Apple;
import allclasses.rozhina.Phone;
import allclasses.kazakova.Coffee;
import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;
import allclasses.buldakov.*;
import allclasses.sadekov.ComputerComponent;
import allclasses.sadekov.E_ComponentSpecs;
import allclasses.sadekov.E_ComponentTypes;
import allclasses.paegle.Chocolate;
import allclasses.gulyaev.Rectangle;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        petrenko();
        tigranyanMethods();
        bartasevichMethod();
        rozhinaMethod();
        kazakova();
        buldakovMethod();
        PaegleMethod();
        gulyaevMethod();
        sadekovMethod();
    }

    public static void tigranyanMethods(){
        Tonality tonality = new Tonality(Notes.A, Scales.MINOR);
        Notes[] scale = tonality.getScaleNotes();
        System.out.println("\nA minor scale notes");
        for (Notes note : scale) {
            System.out.println(note.toString());
        }
    }

    public  static  void petrenko()
    {
        System.out.println("ПЕТРЕНКО");
        SchoolWorkerEntity worker = new SchoolWorkerEntity();

        try (SchoolWorkerRepository repository = new SchoolWorkerRepository(worker)) {
           repository.ChangeWorkerFullName("Anton");
           repository.ChangeWorkerPhone("89119163364");
           repository.ChangeWorkerPosition(Position.Teacher);
        }
        try (PositionRepository repository = new PositionRepository()) {
           repository.ChangeSalary(Position.Teacher, Position.Teacher.GetSalary()*1.1);
           repository.ChangeRequirements(Position.Teacher, "really good teach");
        }

        System.out.println(worker);
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
    public static void kazakova(){
        Coffee coffee = new Coffee("Раф", 1);
        System.out.println("\nКазакова, "+ coffee.getCoffee());
    }

    public static void buldakovMethod() {
        Vector vec1 = new Vector();
        Vector vec2 = new Vector(1.5,2);
        vec1.setX(4);
        vec1.setY(3);
        System.out.println("\nВектор 1: "+vec1.ToString());
        System.out.println("Вектор 2: "+vec2.ToString());
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
    public static void PaegleMethod()
    {
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("GoldApple", "Горький", 75, 200);
        System.out.println(chocolate1.ToPrint());
        System.out.println(chocolate2.ToPrint());
    }
    public static void romanovaMethod() {
        Book book = new Book("Гарри Поттер и Философский камень", "Дж.К. Роулинг", 400, 1200, 1997);
        Book book1 = new Book();
        System.out.println(book.PrintBook());
        System.out.println(book1.PrintBook());
    }
}