package paegle_tests;

import allclasses.paegle.Chocolate;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChocolateTest {
    @Test
    @DisplayName("123")
    @Description("базовый тест")
    @TmsLink("TestCase-1")
    @Issue("BUG-001")
    public void basicTest() {
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Горький", "Тёмный", 75, 150.5);
        String result1 = chocolate1.ToPrint();
        String result2 = chocolate2.ToPrint();

        System.out.println(result1);
        System.out.println(result2);
    }
    @Test
    @DisplayName("1234")
    @Description("Проверка, что правильно выводится")
    @TmsLink("TestCase-2")
    @Issue("BUG-002")
    public void toPrintTest() {
        Chocolate chocolate = new Chocolate("Алёнка", "Молочный", 35, 120.0);
        String expected = "Алёнка тип: Молочный, процент какао: 35%, цена: 120.0 руб.";

        assertEquals(expected, chocolate.ToPrint());
    }
    @Test
    @DisplayName("12345")
    @Description("Проверка, на создание множества объектов")
    @TmsLink("TestCase-3")
    @Issue("BUG-003")
    public void  multipleObjectTest()
    {
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Воздушный", "Белый", 85, 200.0);
        Chocolate chocolate3 = new Chocolate("Milka", "молочный", 30, 150.0);
        assertNotEquals(chocolate1.ToPrint(), chocolate2.ToPrint());
        assertNotEquals(chocolate2.ToPrint(), chocolate3.ToPrint());
    }
}

