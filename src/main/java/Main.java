import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.PositionRepository;
import allclasses.petrenko.repository.SchoolWorkerRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        tigranyan();
        petrenko();

    }

    public static void tigranyan(){

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
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
}