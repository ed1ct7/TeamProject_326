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

    public boolean equals(SchoolWorkerEntity other){
        boolean result;
        if((other == null) || (getClass() != other.getClass())){
            result = false;
        }
        else{
            SchoolWorkerEntity otherPeople = (SchoolWorkerEntity)other;
            result = FullName.equals(other.FullName) &&  Phone.equals(other.Phone) && Position.equals(other.Position);
        }

        return result;
    } // end equals

}
