package paegle_tests;

import allclasses.paegle.Chocolate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChocolateTest {
    @Test
    public void basicTest() {
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Горький", "Тёмный", 75, 150.5);
        String result1 = chocolate1.ToPrint();
        String result2 = chocolate2.ToPrint();

        System.out.println(result1);
        System.out.println(result2);
    }
    @Test
    public void toPrintTest() {
        Chocolate chocolate = new Chocolate("Алёнка", "Молочный", 35, 120.0);
        String expected = "Алёнка тип: Молочный, процент какао: 35%, цена: 120.0 руб.";

        assertEquals(expected, chocolate.ToPrint());
    }
    @Test
    public void  multipleObjectTest()
    {
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Воздушный", "Белый", 85, 200.0);
        Chocolate chocolate3 = new Chocolate("Milka", "молочный", 30, 150.0);
        assertNotEquals(chocolate1.ToPrint(), chocolate2.ToPrint());
        assertNotEquals(chocolate2.ToPrint(), chocolate3.ToPrint());
    }
}

