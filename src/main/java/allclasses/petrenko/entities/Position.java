package allclasses.petrenko.entities;

import java.lang.ref.Cleaner;

public enum Position {
    Empty(0),
    Teacher(80000),
    Manager(120000),
    Cleaner(10000);


    Position(double  salary)
    {
        this.Salary = salary;
    }

    private double Salary;
    public void  SetSalary(Position position, double salary)
    {
        position.Salary=salary;
    }
    }
