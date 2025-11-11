package allclasses.petrenko.repository;

import allclasses.petrenko.entities.Position;

public class PositionRepository {
    private Position position;
    public  PositionRepository(Position position)
    {
        this.position  = position;
    }

    public boolean ChangeSalary(Position position,double salary) {
        try {
            position.SetSalary(position, salary);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
