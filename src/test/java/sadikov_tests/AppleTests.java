package sadikov_tests;

import allclasses.sadikov.Apple;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AppleTests {

    private Apple redApple;
    private Apple greenApple;

    @Before
    public void setUp() {
        redApple = new Apple("red", 200.0, true, "Gala", 8.2);
        greenApple = new Apple("green", 150.0, false, "Granny Smith", 4.5);
    }

    @DisplayName("Тест №1")
    @Description("Золотое жёлтое яблоко")
    @Test
    public void testCanEat() {
        assertTrue(redApple.canEat());
        assertFalse(greenApple.canEat());

        Apple zeroWeightApple = new Apple("yellow", 0.0, true, "Golden", 6.0);
        assertFalse(zeroWeightApple.canEat());
    }

    @DisplayName("Тест №2")
    @Description("Золотое жёлтое яблоко")
    @Test
    public void testTakeBite() {
        double initialWeight = redApple.getWeight();
        redApple.takeBite(50.0);

        assertEquals(initialWeight - 50.0, redApple.getWeight(), 0.001);

        redApple.takeBite(300.0);
        assertEquals(0.0, redApple.getWeight(), 0.001);
    }

    @DisplayName("Тест №3")
    @Description("Кисло-сладкие яблоки")
    @Test
    public void testSweetnessAndWeightComparison() {
        assertEquals("очень сладкое", redApple.getSweetnessCategory());
        assertEquals("кисло-сладкое", greenApple.getSweetnessCategory());

        assertTrue(redApple.isHeavierThan(greenApple));
        assertFalse(greenApple.isHeavierThan(redApple));
    }

    @DisplayName("Тест №4")
    @Description("Изменения веса яблок")
    @Test
    public void testSettersValidation() {
        Apple testApple = new Apple();
        double initialSweetness = testApple.getSweetness();

        testApple.setWeight(-10.0);
        assertTrue(testApple.getWeight() >= 0);

        testApple.setSweetness(15.0);
        assertEquals(initialSweetness, testApple.getSweetness(), 0.001);

        testApple.setSweetness(5.0);
        assertEquals(5.0, testApple.getSweetness(), 0.001);
    }
}