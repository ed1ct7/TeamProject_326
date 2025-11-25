package bartasevichtests;

import allclasses.bartasevich.Toy;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class ToyTests {
    @Test
    @DisplayName("Проверка вывода печати информации об игрушке")
    @Description("Данные об игрушке поступают в конструктор")
    public void infoAboutToyTest(){

        Toy toy = new Toy("Кукла Маша",2,6,100);
        String expected = "Кукла Маша от 2 до 6 цена 100.0";
        String actual = toy.ToString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка того, что игрушка подходит для указанного возраста")
    public void isToyAgeAppropriateTrueTest(){
        Toy toy = new Toy("Кукла Маша",2,6,100);
        boolean actual = toy.isToyAgeAppropriate(5);
        Assert.assertTrue(actual);

    }
    @Test
    @DisplayName("Проверка того, что игрушка не подходит для указанного возраста")
    public void isToyAgeAppropriateFalseTest(){
        Toy toy = new Toy("Кукла Маша",7,14,100);
        boolean actual = toy.isToyAgeAppropriate(5);
        Assert.assertFalse(actual);

    }
}
