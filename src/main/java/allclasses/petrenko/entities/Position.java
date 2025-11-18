package allclasses.petrenko.entities;

public enum Position {
    Empty(0, ""),
    Teacher(80000, "Teach"),
    Manager(120000, "Manage"),
    Cleaner(10000, "Clean");


    Position(double  salary, String requirements)
    {
        this.Salary = salary;
        this.Requirements = requirements;
    }

    private String Requirements;
    public void SetRequirements(Position position, String requirements)
    {
        position.Requirements = requirements;
    }
    public String GetRequirements() {
        return this.Requirements;
    }



    private double Salary;
    public void  SetSalary(Position position, double salary)
    {
        position.Salary=salary;
    }
    public  double GetSalary() { return this.Salary;}
    }

