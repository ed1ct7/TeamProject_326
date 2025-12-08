package allclasses.petrenko.repository;

import allclasses.petrenko.entities.Position;

public class PositionRepository implements AutoCloseable
{
    public  PositionRepository() {}

    @Override
    public void close() {
        System.out.println("PositionRepos закрыт");
    }

    public boolean ChangeSalary(Position position,double salary) {
        try {
            position.SetSalary(position, salary);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    public  boolean ChangeRequirements(Position position,String Requirements){
        try {
            position.SetRequirements(position, Requirements);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
