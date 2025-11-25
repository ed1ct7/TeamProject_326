package petrenko_tests;

import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.SchoolWorkerRepository;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SchoolWorkerTests {

    private SchoolWorkerEntity worker;

    @Before
    public void setUp() {
        worker = new SchoolWorkerEntity();
    }



    @Test
    public void ChangeWorkerName(){
        var name = "Anton";
        try (var repository = new SchoolWorkerRepository(worker)) {
            repository.ChangeWorkerFullName(name);
            assertEquals(name, worker.getFullName());
        }
    }


    @Test
    public void ChangeWorkerPosition(){
        try (var repository = new SchoolWorkerRepository(worker)) {
            var position = Position.Manager;
            repository.ChangeWorkerPosition(position);
            assertEquals(position, worker.getPosition());
        }
    }

    @Test
    public void ChangeWorkerPhone(){
        try (var repository = new SchoolWorkerRepository(worker)) {
            var phone = "8 911 916 33 64";
            repository.ChangeWorkerPhone(phone);
            assertEquals(phone, worker.getPhone());
        }
    }

}
