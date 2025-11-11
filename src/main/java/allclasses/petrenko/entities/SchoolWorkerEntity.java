package allclasses.petrenko.entities;


public class SchoolWorkerEntity
{

    public String getFullName() {
        return FullName;
    }
    public void setFullName(String fullName) {
        this.FullName = fullName;
    }
    private String FullName;

    public double  getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    private double  Salary;

    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    private String Phone;

    public Position getPosition() {
        return Position;
    }

    public void setPosition(Position position) {
        Position = position;
    }

    private Position Position;
}
