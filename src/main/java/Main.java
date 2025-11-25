import allclasses.ezerskiy.entity.SchoolEntity;
import allclasses.ezerskiy.repository.SchoolRepository;
import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.PositionRepository;
import allclasses.petrenko.repository.SchoolWorkerRepository;
import allclasses.bartasevich.Toy;
import allclasses.rozhina.Phone;
import allclasses.kazakova.Coffee;
import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;
import allclasses.buldakov.*;
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
        System.out.printf("Hello and welcome!");
        petrenko();
        tigranyanMethods();
        bartasevichMethod();
        rozhinaMethod();
        kazakova();
        buldakovMethod();
        sadekovMethod();
        ezerskiyMethod();
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

    public  static  void ezerskiyMethod(){
        SchoolRepository SchoolRep = new SchoolRepository();
        SchoolRep.getSchool().setName("Школа №445");
        SchoolRep.getSchool().setAddress("ул. Строителей 16");
        SchoolRep.AddContact("+7 999 999 99 99");
        SchoolRep.AddContact("schol445@mail.ru");
        SchoolRep.AddContact("+7 200 111 12 21");

        SchoolRep.AddWorker(new SchoolWorkerEntity());
        SchoolRep.AddWorker(new SchoolWorkerEntity());
        SchoolRep.AddWorker(new SchoolWorkerEntity());

        System.out.println(SchoolRep.GetSchoolFullNameAddress());
        
        System.out.println("Количество работников школы");
        System.out.println(SchoolRep.getSchool().getWorkers().size());

        System.out.println("Все контакты школы:");
        for (String contact : SchoolRep.getSchool().getContacts())
        {
            System.out.println(contact);
        }
    }

}