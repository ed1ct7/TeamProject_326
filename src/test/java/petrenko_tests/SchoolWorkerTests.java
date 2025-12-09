package petrenko_tests;

import allclasses.petrenko.entities.Position;
import allclasses.petrenko.entities.SchoolWorkerEntity;
import allclasses.petrenko.repository.SchoolWorkerRepository;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SchoolWorkerTests {

    private SchoolWorkerEntity worker;

    @Before
    @Step("Инициализация")
    public void setUp() {
        worker = new SchoolWorkerEntity();
    }



    @Test
    @Step("Тело теста")
    @DisplayName("Проверка репозитория SchoolWorker. Тест на корректность работы метода ChangeWorkerFullName")
    @Description("В данном методе проводится проверка работоспособности метода для изменения имени работника через репозиторий")
    public void ChangeWorkerName(){
        var name = "Anton";
        try (var repository = new SchoolWorkerRepository(worker)) {
            repository.ChangeWorkerFullName(name);
            assertEquals(name, worker.getFullName());
        }
    }


    @Test
    @Step("Тело теста")
    @DisplayName("Проверка репозитория SchoolWorker. Тест на корректность работы метода ChangeWorkerPosition")
    @Description("В данном методе проводится проверка работоспособности метода для изменения должности работника через репозиторий")
    public void ChangeWorkerPosition(){
        try (var repository = new SchoolWorkerRepository(worker)) {
            var position = Position.Manager;
            repository.ChangeWorkerPosition(position);
            assertEquals(position, worker.getPosition());
        }
    }

    @Test
    @Step("Тело теста")
    @DisplayName("Проверка репозитория SchoolWorker. Тест на корректность работы метода ChangeWorkerPhone")
    @Description("В данном методе проводится проверка работоспособности метода для изменения номера телефона работника через репозиторий")

    public void ChangeWorkerPhone(){
        try (var repository = new SchoolWorkerRepository(worker)) {
            var phone = "8 911 916 33 64";
            repository.ChangeWorkerPhone(phone);
            assertEquals(phone, worker.getPhone());
        }
    }

}
