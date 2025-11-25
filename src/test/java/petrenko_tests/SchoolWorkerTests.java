package petrenko_tests;

import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.SchoolWorkerRepository;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SchoolWorkerTests {

    private SchoolWorkerRepository repository;
    private SchoolWorkerEntity worker;

    @Before
    public void setUp() {
        worker = new SchoolWorkerEntity();
        repository = new SchoolWorkerRepository(worker);
    }



    @Test
    public void ChangeWorkerName(){
        var name = "Anton";
        repository.ChangeWorkerFullName(name);
        assertEquals(name, worker.getFullName());
    }


    @Test
    public void ChangeWorkerPosition(){
        var position = Position.Manager;
        repository.ChangeWorkerPosition(position);
        assertEquals(position, worker.getPosition());
    }

    @Test
    public void ChangeWorkerPhone(){
        var phone = "8 911 916 33 64";
        repository.ChangeWorkerPhone(phone);
        assertEquals(phone, worker.getPhone());
    }

}
