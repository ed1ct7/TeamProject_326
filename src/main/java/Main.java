import allclasses.ezerskiy.entity.SchoolEntity;
import allclasses.ezerskiy.repository.SchoolRepository;
import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.PositionRepository;
import allclasses.petrenko.repository.SchoolWorkerRepository;
import allclasses.bartasevich.Toy;
import allclasses.kazakova.Coffee;
import allclasses.tigranyan.Notes;
import allclasses.tigranyan.Scales;
import allclasses.tigranyan.Tonality;
import allclasses.buldakov.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        petrenko();
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