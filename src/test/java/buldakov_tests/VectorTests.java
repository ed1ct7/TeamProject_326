package buldakov_tests;

import allclasses.buldakov.Vector;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class VectorTests {
    @Test
    @DisplayName("Тест 1 метода getLength класса Vector")
    @Description("Вектор (3,4), ожидаемая длина 5")
    public void vectorGetLengthTest1() {
        double expected = 5;
        Vector vector = new Vector(3,4);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    @DisplayName("Тест 2 метода getLength класса Vector")
    @Description("Вектор (-1; -1), ожидаемая длина 1,4142")
    public void vectorGetLengthTest2() {
        double expected = 1.4142;
        Vector vector = new Vector(-1,-1);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    @DisplayName("Тест 3 метода getLength класса Vector")
    @Description("Вектор (1,5; -2), ожидаемая длина 2,5")
    public void vectorGetLengthTest3() {
        double expected = 2.5;
        Vector vector = new Vector(1.5,-2);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
}
