package ezerskiy_tests;

import allclasses.ezerskiy.entity.SchoolEntity;
import allclasses.ezerskiy.repository.SchoolRepository;
import static org.junit.Assert.*;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
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
    @DisplayName("Проверка изменения имени школы")
    @Description("Изменения имени школы через константу и метод класса репозитория")
    public  void ChangeSchoolName_Test()
    {
        String newName = "School №12";
        repository.ChangeSchoolName(newName);
        assertEquals(newName, repository.getSchool().getName());
    }

    @Test
    @DisplayName("Проверка добавления контакта школы")
    @Description ("Добавления двух контактных номеров к пустому списку контактов школы")
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
    @DisplayName("Проверка получение полного имени школы с адресом")
    @Description ("Получение полного имени школы с адресом с помощью метода репозитория")
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
