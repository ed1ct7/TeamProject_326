package kovalenko_tests;

import allclasses.kovalenko.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {

    @Test
    public void toStringTest() {
        Animal animal = new Animal("Барсик", "Кот", 2, 4.5);
        String expected = "Вид: Кот, имя: Барсик, возраст: 2 лет, вес: 4.5 кг";
        String actual = animal.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringDefaultConstructorTest() {
        Animal animal = new Animal();
        String expected = "Вид: Неизвестно, имя: Неизвестно, возраст: 0 лет, вес: 0.0 кг";
        String actual = animal.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isYoungTrueTest() {
        Animal animal = new Animal("Щенок", "Собака", 1, 8.0);
        boolean actual = animal.isYoung();
        Assert.assertTrue(actual);
    }

    @Test
    public void isYoungFalseTest() {
        Animal animal = new Animal("Мурзик", "Кот", 7, 6.2);
        boolean actual = animal.isYoung();
        Assert.assertFalse(actual);
    }

    @Test
    public void isYoungBoundaryTest() {
        Animal animal = new Animal("Рекс", "Собака", 3, 15.0);
        boolean actual = animal.isYoung();
        Assert.assertTrue(actual);
    }

    @Test
    public void isLightWeightTrueTest() {
        Animal animal = new Animal("Кеша", "Попугай", 2, 0.3);
        boolean actual = animal.isLightWeight();
        Assert.assertTrue(actual);
    }

    @Test
    public void isLightWeightFalseTest() {
        Animal animal = new Animal("Тузик", "Собака", 4, 12.5);
        boolean actual = animal.isLightWeight();
        Assert.assertFalse(actual);
    }

    @Test
    public void isLightWeightBoundaryTest() {
        Animal animal = new Animal("Хома", "Хомяк", 1, 5.0);
        boolean actual = animal.isLightWeight();
        Assert.assertTrue(actual);
    }

    @Test
    public void isAdultTrueTest() {
        Animal animal = new Animal("Полкан", "Собака", 5, 30.0);
        boolean actual = animal.isAdult();
        Assert.assertTrue(actual);
    }

    @Test
    public void isAdultFalseTest() {
        Animal animal = new Animal("Малыш", "Котенок", 1, 1.2);
        boolean actual = animal.isAdult();
        Assert.assertFalse(actual);
    }

    @Test
    public void isAdultBoundaryTest() {
        Animal animal = new Animal("Рыжик", "Кот", 3, 5.8);
        boolean actual = animal.isAdult();
        Assert.assertTrue(actual);
    }

    @Test
    public void increaseAgeTest() {
        Animal animal = new Animal("Шарик", "Собака", 4, 18.0);
        animal.increaseAge();
        String result = animal.toString();
        Assert.assertTrue(result.contains("возраст: 5 лет"));
    }

    @Test
    public void changeWeightPositiveTest() {
        Animal animal = new Animal("Мурка", "Кошка", 3, 3.8);
        animal.changeWeight(4.2);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 4.2 кг"));
    }

    @Test
    public void changeWeightNegativeTest() {
        Animal animal = new Animal("Бобик", "Собака", 2, 9.5);
        animal.changeWeight(-5.0);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 9.5 кг"));
    }

    @Test
    public void changeWeightZeroTest() {
        Animal animal = new Animal("Пушок", "Кролик", 1, 2.1);
        animal.changeWeight(0.0);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 0.0 кг"));
    }

    @Test
    public void isHeavyTrueTest() {
        Animal animal = new Animal("Буян", "Медведь", 10, 350.0);
        boolean actual = animal.isHeavy();
        Assert.assertTrue(actual);
    }

    @Test
    public void isHeavyFalseTest() {
        Animal animal = new Animal("Чижик", "Попугай", 3, 0.4);
        boolean actual = animal.isHeavy();
        Assert.assertFalse(actual);
    }

    @Test
    public void isHeavyBoundaryTest() {
        Animal animal = new Animal("Зорька", "Корова", 6, 50.0);
        boolean actual = animal.isHeavy();
        Assert.assertTrue(actual);
    }
}