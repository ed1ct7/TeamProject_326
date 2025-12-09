package kulikovtests;

import allclasses.kulikov.Parallelogram;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;

import org.junit.Assert;
import org.junit.Test;

public class ParallelogramTests {
    @Test
    @DisplayName("Проверка площади параллелограма с длиной 2 и шириной 7")
    @Description("Проверка функции для нахождения площади параллелограма")
    @Step("Шаг первый")
    @TmsLink("TestCase-1")
    @Issue("BUG-100")
    public void parallelogramSquareTest1(){
        double expected = 14;
        Parallelogram parallelogram = new Parallelogram(2,7);
        double actual = parallelogram.getSquare();
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    @DisplayName("Проверка площади параллелограма с длиной 4 и шириной 2.65")
    @Description("Проверка функции для нахождения площади параллелограма")
    @Step("Шаг второй")
    @TmsLink("TestCase-2")
    @Issue("BUG-101")
    public void parallelogramSquareTest2(){
        double expected = 10.6;
        Parallelogram parallelogram = new Parallelogram(4,2.65);
        double actual = parallelogram.getSquare();
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    @DisplayName("Проверка площади параллелограма с длиной 3 и шириной 2.8")
    @Description("Проверка функции для нахождения площади параллелограма")
    @Step("Шаг третий")
    @TmsLink("TestCase-3")
    @Issue("BUG-102")
    public void parallelogramSquareTest3(){
        double expected = 8.4;
        Parallelogram parallelogram = new Parallelogram(3,2.8);
        double actual = parallelogram.getSquare();
        Assert.assertEquals(expected, actual, 0.0001);
    }
}