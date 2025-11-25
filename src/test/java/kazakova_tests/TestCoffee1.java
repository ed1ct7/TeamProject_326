package kazakova_tests;

import allclasses.kazakova.Coffee;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCoffee1 {
    @Test
    public void buyCoffee() {
        Coffee coffee1 = new Coffee("Latte", 5);
        assertEquals("Кофе: Latte, сахара: 5 ложек.", coffee1.getCoffee());
    }

    @Test
    public void addSugarTest() {
        Coffee coffee = new Coffee("Americano", 2);
        String result = coffee.addSugar(3);
        assertEquals("Новое количество сахара: 5", result);
        assertEquals("Кофе: Americano, сахара: 5 ложек.", coffee.getCoffee());
    }
}
