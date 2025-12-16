package rozhina_tests;

import allclasses.rozhina.Phone;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class PhoneTests {
    @Test
    @DisplayName("Проверка вывода информации о телефоне")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что метод ToString() возвращает корректную строку.")
    public void infoAboutPhoneTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        String expected = "iPhone 16 Pro Max, память: 256 ГБ, заряд: 10%, цена: 104490.0 руб.";
        String actual = phone.ToString();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Проверка, что телефон стоит дешево")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            " Тест проверяет, что метод isCheapPrice() возвращает true, т.к. поле price = 30273.")
    public void isCheapPriceTrueTest() {
        Phone phone = new Phone("iPhone", "11 Pro Max", 30273, 256, 10);
        boolean actual = phone.isCheapPrice();
        Assert.assertTrue(actual);
    }
    @Test
    @DisplayName("Проверка, что телефон стоит дорого")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что метод isCheapPrice() возвращает false, т.к. поле price = 104490.")
    public void isCheapPriceFalseTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        boolean actual = phone.isCheapPrice();
        Assert.assertFalse(actual);
    }
    @Test
    @DisplayName("Проверка, что у телефона мало памяти")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что метод isLittleMemory() возвращает true, т.к. поле memory = 8.")
    public void isLittleMemoryTrueTest() {
        Phone phone = new Phone("Samsung", "Galaxy Grand Prime", 9450, 8, 60);
        boolean actual = phone.isLittleMemory();
        Assert.assertTrue(actual);
    }
    @Test
    @DisplayName("Проверка, что у телефона не мало памяти")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что метод isLittleMemory() возвращает false, т.к. поле memory = 256.")
    public void isLittleMemoryFalseTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        boolean actual = phone.isLittleMemory();
        Assert.assertFalse(actual);
    }
    @Test
    @DisplayName("Проверка, что у телефона низкий заряд")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что метод isLowBattery() возвращает true, т.к. поле battery = 10.")
    public void isLowBatteryTrueTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        boolean actual = phone.isLowBattery();
        Assert.assertTrue(actual);
    }
    @Test
    @DisplayName("Проверка, что у телефона не низкий заряд")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что метод isLowBattery() возвращает false, т.к. поле battery = 60.")
    public void isLowBatteryFalseTest() {
        Phone phone = new Phone("Samsung", "Galaxy Grand Prime", 9450, 8, 60);
        boolean actual = phone.isLowBattery();
        Assert.assertFalse(actual);
    }
    @Test
    @DisplayName("Проверка, что телефон полностью заряжается")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что значение поля battery становится равным 100.")
    public void chargeToFullTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        phone.chargeToFull();
        int expected = 100;
        int actual = phone.getBattery();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Проверка, что телефон полностью разряжается")
    @Description("Создается объект класса Phone через конструктор с параметрами." +
            "Тест проверяет, что значение поля battery становится равным 0.")
    public void dischargeFullyTest() {
        Phone phone = new Phone("Samsung", "Galaxy Grand Prime", 9450, 8, 60);
        phone.dischargeFully();
        int expected = 0;
        int actual = phone.getBattery();
        Assert.assertEquals(expected, actual);
    }
}
