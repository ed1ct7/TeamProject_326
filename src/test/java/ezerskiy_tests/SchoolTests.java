package ezerskiy_tests;

import allclasses.ezerskiy.entity.SchoolEntity;
import allclasses.ezerskiy.repository.SchoolRepository;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SchoolTests
{
    private SchoolRepository repository;

    @Before
    public void SetUp()
    {
        repository = new SchoolRepository();
    }

    @Test
    public  void ChangeSchoolName_Test()
    {
        String newName = "School №12";
        repository.ChangeSchoolName(newName);
        assertEquals(newName, repository.getSchool().getName());
    }

    @Test
    public void AddContact_Test()
    {
        String newContact1 = "+7 999 000 99 00";
        String newContact2 = "+7 787 111 90 90";

        List<String> contactList = Arrays.asList(newContact1,newContact2);

        repository.AddContact(newContact1);
        repository.AddContact(newContact2);

        assertEquals(contactList, repository.getSchool().getContacts());
    }

    @Test
    public void GetSchoolFullNameAddress_Test()
    {
        String Name = "School";
        String Address = "Address";

        String Full = Name + ", " + Address;

        repository.getSchool().setName(Name);
        repository.getSchool().setAddress(Address);

        assertEquals(Full,repository.GetSchoolFullNameAddress());
    }

}
