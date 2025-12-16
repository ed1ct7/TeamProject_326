package kovalenko_tests;

import allclasses.kovalenko.Animal;
import org.junit.Assert;
import org.junit.Test;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;

public class AnimalTests {

    @Test
    @DisplayName("Проверка метода toString с параметрами")
    @Description("Тест проверяет корректное форматирование строки для животного с заданными параметрами")
    public void toStringTest() {
        Animal animal = new Animal("Барсик", "Кот", 2, 4.5);
        String expected = "Вид: Кот, имя: Барсик, возраст: 2 лет, вес: 4.5 кг";
        String actual = animal.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка метода toString по умолчанию")
    @Description("Тест проверяет форматирование строки для животного, созданного конструктором по умолчанию")
    public void toStringDefaultConstructorTest() {
        Animal animal = new Animal();
        String expected = "Вид: Неизвестно, имя: Неизвестно, возраст: 0 лет, вес: 0.0 кг";
        String actual = animal.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка isYoung (положительный случай)")
    @Description("Тест проверяет, что метод isYoung возвращает true для животного младше 3 лет")
    public void isYoungTrueTest() {
        Animal animal = new Animal("Щенок", "Собака", 1, 8.0);
        boolean actual = animal.isYoung();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка isYoung (отрицательный случай)")
    @Description("Тест проверяет, что метод isYoung возвращает false для животного старше 3 лет")
    public void isYoungFalseTest() {
        Animal animal = new Animal("Мурзик", "Кот", 7, 6.2);
        boolean actual = animal.isYoung();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка isYoung граничное значение")
    @Description("Тест проверяет поведение метода isYoung для животного возрастом ровно 3 года")
    public void isYoungBoundaryTest() {
        Animal animal = new Animal("Рекс", "Собака", 3, 15.0);
        boolean actual = animal.isYoung();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка isLightWeight (положительный случай)")
    @Description("Тест проверяет, что метод isLightWeight возвращает true для животного весом менее 5 кг")
    public void isLightWeightTrueTest() {
        Animal animal = new Animal("Кеша", "Попугай", 2, 0.3);
        boolean actual = animal.isLightWeight();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка isLightWeight (отрицательный случай)")
    @Description("Тест проверяет, что метод isLightWeight возвращает false для животного весом более 5 кг")
    public void isLightWeightFalseTest() {
        Animal animal = new Animal("Тузик", "Собака", 4, 12.5);
        boolean actual = animal.isLightWeight();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка isLightWeight граничное значение")
    @Description("Тест проверяет поведение метода isLightWeight для животного весом ровно 5 кг")
    public void isLightWeightBoundaryTest() {
        Animal animal = new Animal("Хома", "Хомяк", 1, 5.0);
        boolean actual = animal.isLightWeight();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка isAdult (положительный случай)")
    @Description("Тест проверяет, что метод isAdult возвращает true для животного старше 2 лет")
    public void isAdultTrueTest() {
        Animal animal = new Animal("Полкан", "Собака", 5, 30.0);
        boolean actual = animal.isAdult();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка isAdult (отрицательный случай)")
    @Description("Тест проверяет, что метод isAdult возвращает false для животного младше 2 лет")
    public void isAdultFalseTest() {
        Animal animal = new Animal("Малыш", "Котенок", 1, 1.2);
        boolean actual = animal.isAdult();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка isAdult граничное значение")
    @Description("Тест проверяет поведение метода isAdult для животного возрастом ровно 3 года")
    public void isAdultBoundaryTest() {
        Animal animal = new Animal("Рыжик", "Кот", 3, 5.8);
        boolean actual = animal.isAdult();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка метода increaseAge")
    @Description("Тест проверяет увеличение возраста животного на 1 год при вызове метода increaseAge")
    public void increaseAgeTest() {
        Animal animal = new Animal("Шарик", "Собака", 4, 18.0);
        animal.increaseAge();
        String result = animal.toString();
        Assert.assertTrue(result.contains("возраст: 5 лет"));
    }

    @Test
    @DisplayName("Проверка changeWeight положительное значение")
    @Description("Тест проверяет корректное изменение веса животного при передаче положительного значения")
    public void changeWeightPositiveTest() {
        Animal animal = new Animal("Мурка", "Кошка", 3, 3.8);
        animal.changeWeight(4.2);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 4.2 кг"));
    }

    @Test
    @DisplayName("Проверка changeWeight отрицательное значение")
    @Description("Тест проверяет, что вес не изменяется при передаче отрицательного значения")
    public void changeWeightNegativeTest() {
        Animal animal = new Animal("Бобик", "Собака", 2, 9.5);
        animal.changeWeight(-5.0);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 9.5 кг"));
    }

    @Test
    @DisplayName("Проверка changeWeight нулевое значение")
    @Description("Тест проверяет возможность установки веса животного в 0 кг")
    public void changeWeightZeroTest() {
        Animal animal = new Animal("Пушок", "Кролик", 1, 2.1);
        animal.changeWeight(0.0);
        String result = animal.toString();
        Assert.assertTrue(result.contains("вес: 0.0 кг"));
    }

    @Test
    @DisplayName("Проверка isHeavy (положительный случай)")
    @Description("Тест проверяет, что метод isHeavy возвращает true для животного весом более 20 кг")
    public void isHeavyTrueTest() {
        Animal animal = new Animal("Буян", "Медведь", 10, 350.0);
        boolean actual = animal.isHeavy();
        Assert.assertTrue(actual);
    }

    @Test
    @DisplayName("Проверка isHeavy (отрицательный случай)")
    @Description("Тест проверяет, что метод isHeavy возвращает false для животного весом менее 20 кг")
    public void isHeavyFalseTest() {
        Animal animal = new Animal("Чижик", "Попугай", 3, 0.4);
        boolean actual = animal.isHeavy();
        Assert.assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка isHeavy граничное значение")
    @Description("Тест проверяет поведение метода isHeavy для животного весом ровно 50 кг")
    public void isHeavyBoundaryTest() {
        Animal animal = new Animal("Зорька", "Корова", 6, 50.0);
        boolean actual = animal.isHeavy();
        Assert.assertTrue(actual);
    }
}