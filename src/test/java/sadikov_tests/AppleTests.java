package sadikov_tests;

import allclasses.sadikov.Apple;

public class AppleTests {

    public static void main(String[] args) {
        testCanEat();
        testTakeBite();
        testSweetnessAndWeightComparison();
        testSettersValidation();
        System.out.println("Все тесты завершены");
    }

    public static void testCanEat() {
        Apple redApple = new Apple("red", 200.0, true, "Gala", 8.2);
        Apple greenApple = new Apple("green", 150.0, false, "Granny Smith", 4.5);
        Apple zeroWeightApple = new Apple("yellow", 0.0, true, "Golden", 6.0);

        boolean test1 = redApple.canEat();
        boolean test2 = greenApple.canEat();
        boolean test3 = zeroWeightApple.canEat();

        if (test1 && !test2 && !test3) {
            System.out.println("Тест 1 пройден");
        } else {
            System.out.println("Тест 1 провален");
        }
    }

    public static void testTakeBite() {
        Apple apple = new Apple("red", 200.0, true, "Gala", 8.2);
        double initialWeight = apple.getWeight();

        apple.takeBite(50.0);
        double weightAfterBite = apple.getWeight();

        apple.takeBite(300.0);
        double finalWeight = apple.getWeight();

        boolean testPassed = (weightAfterBite == initialWeight - 50.0) && (finalWeight == 0.0);

        if (testPassed) {
            System.out.println("Тест 2 пройден");
        } else {
            System.out.println("Тест 2 провален");
        }
    }

    public static void testSweetnessAndWeightComparison() {
        Apple redApple = new Apple("red", 200.0, true, "Gala", 8.2);
        Apple greenApple = new Apple("green", 150.0, false, "Granny Smith", 4.5);
        Apple sweetApple = new Apple("red", 100.0, true, "Sweet", 6.0);
        Apple sourApple = new Apple("green", 100.0, true, "Sour", 3.9);

        String category1 = redApple.getSweetnessCategory();
        String category2 = greenApple.getSweetnessCategory();
        String category3 = sweetApple.getSweetnessCategory();
        String category4 = sourApple.getSweetnessCategory();

        boolean isHeavier = redApple.isHeavierThan(greenApple);
        boolean isNotHeavier = greenApple.isHeavierThan(redApple);

        boolean sweetnessTest = category1.equals("очень сладкое") &&
                category2.equals("кисло-сладкое") &&
                category3.equals("сладкое") &&
                category4.equals("кислое");

        boolean weightTest = isHeavier && !isNotHeavier;

        if (sweetnessTest && weightTest) {
            System.out.println("Тест 3 пройден");
        } else {
            System.out.println("Тест 3 провален");
        }
    }

    public static void testSettersValidation() {
        Apple apple = new Apple();
        double initialWeight = apple.getWeight();
        double initialSweetness = apple.getSweetness();

        apple.setWeight(-10.0);
        double weightAfterInvalid = apple.getWeight();

        apple.setSweetness(15.0);
        double sweetnessAfterInvalid = apple.getSweetness();

        apple.setWeight(100.0);
        apple.setSweetness(5.0);

        boolean weightValid = weightAfterInvalid == initialWeight;
        boolean sweetnessValid = sweetnessAfterInvalid == initialSweetness;
        boolean finalValuesCorrect = apple.getWeight() == 100.0 && apple.getSweetness() == 5.0;

        if (weightValid && sweetnessValid && finalValuesCorrect) {
            System.out.println("Тест 4 пройден");
        } else {
            System.out.println("Тест 4 провален");
        }
    }
}