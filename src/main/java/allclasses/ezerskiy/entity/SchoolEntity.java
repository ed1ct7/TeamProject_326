package allclasses.ezerskiy.entity;

import java.util.List;

public class SchoolEntity
{
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<String> getContacts() {
        return Contacts;
    }

    public void setContacts(List<String> contacts) {
        Contacts = contacts;
    }

    public List<String> getWorkers() {
        return Workers;
    }

    public void setWorkers(List<String> workers) {
        Workers = workers;
    }

    public List<String> getStudents() {
        return Students;
    }

    public void setStudents(List<String> students) {
        Students = students;
    }

    public Double getArea() {
        return Area;
    }

    public void setArea(Double area) {
        Area = area;
    }

    public Integer getNumberOfClassrooms() {
        return NumberOfClassrooms;
    }

    public void setNumberOfClassrooms(Integer numberOfClassrooms) {
        NumberOfClassrooms = numberOfClassrooms;
    }

    private String Name;
    private String Address;
    private List<String> Contacts;
    private List<String> Workers;
    private List<String> Students;
    private Double Area;
    private Integer NumberOfClassrooms;
}
