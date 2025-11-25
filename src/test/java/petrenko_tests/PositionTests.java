package petrenko_tests;

import allclasses.petrenko.entities.Position;
import allclasses.petrenko.repository.PositionRepository;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTests {
    private Position position;
    private PositionRepository repository;

    @Before
    public void setUp() {
        position = Position.Empty;
        repository = new PositionRepository();

    }

    @Test
    public  void  ChangePositionSalary(){
        double newSalary = 250000;
        repository.ChangeSalary(position, newSalary);
        assertEquals(newSalary, position.GetSalary(), 0.0000001);
    }

    @Test
    public  void ChangePositionRequirements(){
        String requirements = "New Req";
        repository.ChangeRequirements(position, requirements);
        assertEquals(requirements, position.GetRequirements());
    }
}
