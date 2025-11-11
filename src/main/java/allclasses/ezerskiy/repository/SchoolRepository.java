package allclasses.ezerskiy.repository;

import allclasses.ezerskiy.entity.SchoolEntity;
import com.sun.source.tree.Scope;

public class SchoolRepository
{
    private SchoolEntity School;

    public SchoolRepository()
    {
        School = new SchoolEntity();
        InitSchool();
    }
    public SchoolRepository(SchoolEntity bakedschool)
    {
        School = bakedschool;
    }

    private void InitSchool()
    {
      School.setName("BASE_NAME");
      School.setAddress("BASE_ADDRESS");
      School.setContacts(null);
      School.setWorkers(null);
      School.setStudents(null);
      School.setArea(0.0);
      School.setNumberOfClassrooms(0);
    }

    public void HireWorker(String newworker)
    {
        var workers = School.getWorkers();
        workers.add(newworker);
    }
}
