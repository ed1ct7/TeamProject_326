package rozhina_tests;

import allclasses.rozhina.Phone;
import org.junit.Assert;
import org.junit.Test;

public class PhoneTests {
    @Test
    public void infoAboutPhoneTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        String expected = "iPhone 16 Pro Max, память: 256 ГБ, заряд: 10%, цена: 104490.0 руб.";
        String actual = phone.ToString();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isCheapPriceTrueTest() {
        Phone phone = new Phone("iPhone", "11 Pro Max", 30273, 256, 10);
        boolean actual = phone.isCheapPrice();
        Assert.assertTrue(actual);
    }
    @Test
    public void isCheapPriceFalseTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        boolean actual = phone.isCheapPrice();
        Assert.assertFalse(actual);
    }
    @Test
    public void isLittleMemoryTrueTest() {
        Phone phone = new Phone("Samsung", "Galaxy Grand Prime", 9450, 8, 60);
        boolean actual = phone.isLittleMemory();
        Assert.assertTrue(actual);
    }
    @Test
    public void isLittleMemoryFalseTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        boolean actual = phone.isLittleMemory();
        Assert.assertFalse(actual);
    }
    @Test
    public void isLowBatteryTrueTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        boolean actual = phone.isLowBattery();
        Assert.assertTrue(actual);
    }
    @Test
    public void isLowBatteryFalseTest() {
        Phone phone = new Phone("Samsung", "Galaxy Grand Prime", 9450, 8, 60);
        boolean actual = phone.isLowBattery();
        Assert.assertFalse(actual);
    }
    @Test
    public void chargeToFullTest() {
        Phone phone = new Phone("iPhone", "16 Pro Max", 104490, 256, 10);
        phone.chargeToFull();
        int expected = 100;
        int actual = phone.getBattery();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dischargeFullyTest() {
        Phone phone = new Phone("Samsung", "Galaxy Grand Prime", 9450, 8, 60);
        phone.dischargeFully();
        int expected = 0;
        int actual = phone.getBattery();
        Assert.assertEquals(expected, actual);
    }
}
