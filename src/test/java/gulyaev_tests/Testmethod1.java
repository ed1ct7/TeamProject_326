package gulyaev_tests;

import allclasses.gulyaev.Rectangle;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class Testmethod1 {

    @Test
    @DisplayName("Нахождение площади квадрата")
    @Description("Проверка, что функция по нахождению квадрата прямоугольника")
    @TmsLink("TestCase-1")
    @Issue("Bug00124")
    public void rectangleGetSquareTest(){
        int expected = 6;
        Rectangle rec1 = new Rectangle(2, 3);
        int actual = rec1.Square();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Нахождение периметра квадрата")
    @Description("Проверка, что функция корректно считает периметр прямоугольника")
    @TmsLink("TestCase-2")
    @Issue("Bug012")
    public void rectangleGetPerimetr(){
        int expected = 10;
        Rectangle rec1 = new Rectangle(2,3);
        int actual = rec1.Perimeter();
        Assert.assertEquals(expected, actual);
    }
}
