package allclasses.petrenko.repository;

import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;

public class SchoolWorkerRepository implements AutoCloseable
{
    SchoolWorkerEntity worker;

    public SchoolWorkerRepository() {
        worker = new SchoolWorkerEntity();
        worker.setPosition(Position.Empty);
        worker.setFullName("Новый работник");
        worker.setPhone("+79119163364");
    }
    public SchoolWorkerRepository(SchoolWorkerEntity worker) {
        this.worker = worker;
    }


    public boolean ChangeWorkerPosition(Position position) {
        try {
            worker.setPosition(position);
            return  true;
        }
        catch(Exception ex) {
            return false;
        }
    }
    public boolean ChangeWorkerFullName(String FullName){
        try {
            worker.setFullName(FullName);
            return  true;
        }
        catch(Exception ex) {
            return false;
        }
    }
    public boolean ChangeWorkerPhone(String phone){
        try {
            worker.setPhone(phone);
            return  true;
        }
        catch(Exception ex) {
            return false;
        }
    }

    public SchoolWorkerEntity getWorker()
    {
        return worker;
    }

    @Override
    public void close() {
        // Освобождение ресурсов
        System.out.println("SchoolWorkerRepos закрыт");
    }




}
