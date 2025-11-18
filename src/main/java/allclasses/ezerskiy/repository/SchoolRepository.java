package allclasses.ezerskiy.repository;

import allclasses.ezerskiy.entity.SchoolEntity;
import allclasses.petrenko.entities.SchoolWorkerEntity;

import java.util.List;

public class SchoolRepository
{
    public SchoolEntity getSchool() {
        return School;
    }

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

    public void AddWorker(SchoolWorkerEntity newworker)
    {
        School.getWorkers().add(newworker);
    }

    public  void RemoveWorker(SchoolWorkerEntity fireworker)
    {
        var workers = School.getWorkers();
        for (int i = 0; i < workers.size(); i++ )
        {
            if (workers.get(i) == fireworker)
            {
                workers.remove(i);
                break;
            }
        }
        School.setWorkers(workers);
    }

    public void AddStudent(String NewStudent)
    {
        School.getStudents().add(NewStudent);
    }
    public void  RemoveStudent(String Student)
    {
        var students = School.getStudents();
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).equals(Student))
            {
                students.remove(i);
                break;
            }
        }
        School.setStudents(students);
    }

    public void ChangeSchoolName(String NewName)
    {
        School.setName(NewName);
    }

    public void ChangeSchoolAddress(String NewAddress)
    {
        School.setAddress(NewAddress);
    }

    public void AddContact(String NewContact)
    {
        School.getContacts().add(NewContact);
    }
    public void ClearContacts()
    {
        School.getContacts().clear();
    }
    public void OverrideContacts(List<String> NewContacts)
    {
        School.setContacts(NewContacts);
    }

    public String GetSchoolFullNameAddress()
    {
        return School.getName() + ", " + School.getAddress();
    }
    public int GetSchoolCapacity()
    {
        return School.getNumberOfClassrooms() * 30;
    }
    public boolean IsEnoughSpaceForStudents()
    {
        return GetSchoolCapacity() > School.getStudents().size();
    }

    public void ChangeSchoolArea(Double NewArea)
    {
        School.setArea(NewArea);
    }
    public void ChangeNumberOfClassRooms(int NewNumber)
    {
        School.setNumberOfClassrooms(NewNumber);
    }
}
