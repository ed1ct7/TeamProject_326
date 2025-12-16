package petrenko_tests;

import allclasses.petrenko.entities.Position;
import allclasses.petrenko.repository.PositionRepository;
import static org.junit.Assert.*;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTests {
    private Position position;
    private PositionRepository repository;

    @Before
    @Step("Инициализация")
    public void setUp() {
        position = Position.Empty;
        repository = new PositionRepository();
    }

    @Test
    @Step("Тело теста")
    @DisplayName("Проверка репозитория Position. Тест на корректность работы метода ChangeSalary")
    @Description("В данном методе проводится проверка работоспособности метода для изменения зарплаты на определенной должности через репозиторий")
    public  void  ChangePositionSalary(){
        double newSalary = 250000;
        repository.ChangeSalary(position, newSalary);
        assertEquals(newSalary, position.GetSalary(), 0.0000001);
    }

    @Test
    @Step("Тело теста")
    @DisplayName("Проверка репозитория Position. Тест на корректность работы метода ChangeRequirements")
    @Description("В данном методе проводится проверка работоспособности метода для изменения обязанностей работника этой должности через репозиторий")
    public  void ChangePositionRequirements(){
        String requirements = "New Req";
        repository.ChangeRequirements(position, requirements);
        assertEquals(requirements, position.GetRequirements());
    }
}
