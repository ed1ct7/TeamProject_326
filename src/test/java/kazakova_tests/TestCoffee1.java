package kazakova_tests;

import allclasses.kazakova.Coffee;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import static org.junit.Assert.*;

public class TestCoffee1 {
    @Test
    @DisplayName("Проверка создания кофе")
    @Description("Создание Латте с 5 ложками сахара")
    @TmsLink("Test-case-2")
    @Issue("Bug01")
    public void buyCoffee() {
        Coffee coffee1 = new Coffee("Latte", 5);
        assertEquals("Кофе: Latte, сахара: 5 ложек.", coffee1.getCoffee());
    }

    @Test
    @DisplayName("Проверка добавления сахара")
    @Description("Добавление сахара")
    @TmsLink("Test-case-2")
    @Issue("Bug02")
    public void addSugarTest() {
        Coffee coffee = new Coffee("Americano", 2);
        String result = coffee.addSugar(3);
        assertEquals("Новое количество сахара: 5", result);
        assertEquals("Кофе: Americano, сахара: 5 ложек.", coffee.getCoffee());
    }
}
