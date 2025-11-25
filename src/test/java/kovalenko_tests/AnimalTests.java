package kovalenko_tests;

import allclasses.kovalenko.animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {

    @Test
    public void toStringTest() {
        animal animal = new animal("Барсик", "Кот", 2, 4.5);
        String expected = "Вид: Кот, имя: Барсик, возраст: 2 лет, вес: 4.5 кг";
        String actual = animal.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringDefaultConstructorTest() {
        animal animal = new animal();
        String expected = "Вид: Неизвестно, имя: Неизвестно, возраст: 0 лет, вес: 0.0 кг";
        String actual = animal.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isYoungTrueTest() {
        animal animal = new animal("Щенок", "Собака", 1, 8.0);
        boolean actual = animal.isYoung();
        Assert.assertTrue(actual);
    }

    @Test
    public void isYoungFalseTest() {
        animal animal = new animal("Мурзик", "Кот", 7, 6.2);
        boolean actual = animal.isYoung();
        Assert.assertFalse(actual);
    }

    @Test
    public void isYoungBoundaryTest() {
        animal animal = new animal("Рекс", "Собака", 3, 15.0);
        boolean actual = animal.isYoung();
        Assert.assertTrue(actual);
    }

    @Test
    public void isLightWeightTrueTest() {
        animal animal = new animal("Кеша", "Попугай", 2, 0.3);
        boolean actual = animal.isLightWeight();
        Assert.assertTrue(actual);
    }

    @Test
    public void isLightWeightFalseTest() {
        animal animal = new animal("Тузик", "Собака", 4, 12.5);
        boolean actual = animal.isLightWeight();
        Assert.assertFalse(actual);
    }

    @Test
    public void isLightWeightBoundaryTest() {
        animal animal = new animal("Хома", "Хомяк", 1, 5.0);
        boolean actual = animal.isLightWeight();
        Assert.assertTrue(actual);
    }

    @Test
    public void isAdultTrueTest() {
        animal animal = new animal("Полкан", "Собака", 5, 30.0);
        boolean actual = animal.isAdult();
        Assert.assertTrue(actual);
    }

    @Test
    public void isAdultFalseTest() {
        animal animal = new animal("Малыш", "Котенок", 1, 1.2);
        boolean actual = animal.isAdult();
        Assert.assertFalse(actual);
    }

    @Test
    public void isAdultBoundaryTest() {
        animal animal = new animal("Рыжик", "Кот", 3, 5.8);
        boolean actual = animal.isAdult();
        Assert.assertTrue(actual);
    }

    @Test
    public void increaseAgeTest() {
        animal animal = new animal("Шарик", "Собака", 4, 18.0);
        animal.increaseAge();
        String result = animal.toString();
        Assert.assertTrue(result.contains("возраст: 5 лет"));
    }

    @Test
    public void changeWeightPositiveTest() {
        animal animal = new animal("Мурка", "Кошка", 3, 3.8);
        animal.changeWeight(4.2);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 4.2 кг"));
    }

    @Test
    public void changeWeightNegativeTest() {
        animal animal = new animal("Бобик", "Собака", 2, 9.5);
        animal.changeWeight(-5.0);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 9.5 кг"));
    }

    @Test
    public void changeWeightZeroTest() {
        animal animal = new animal("Пушок", "Кролик", 1, 2.1);
        animal.changeWeight(0.0);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 0.0 кг"));
    }

    @Test
    public void isHeavyTrueTest() {
        animal animal = new animal("Буян", "Медведь", 10, 350.0);
        boolean actual = animal.isHeavy();
        Assert.assertTrue(actual);
    }

    @Test
    public void isHeavyFalseTest() {
        animal animal = new animal("Чижик", "Попугай", 3, 0.4);
        boolean actual = animal.isHeavy();
        Assert.assertFalse(actual);
    }

    @Test
    public void isHeavyBoundaryTest() {
        animal animal = new animal("Зорька", "Корова", 6, 50.0);
        boolean actual = animal.isHeavy();
        Assert.assertTrue(actual);
    }
}