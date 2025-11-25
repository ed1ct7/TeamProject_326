package bartasevichtests;

import allclasses.bartasevich.Toy;
import org.junit.Assert;
import org.junit.Test;

public class ToyTests {
    @Test
    public void infoAboutToyTest(){

        Toy toy = new Toy("Кукла Маша",2,6,100);
        String expected = "Кукла Маша от 2 до 6 цена 100.0";
        String actual = toy.ToString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isToyAgeAppropriateTrueTest(){
        Toy toy = new Toy("Кукла Маша",2,6,100);
        boolean actual = toy.isToyAgeAppropriate(5);
        Assert.assertTrue(actual);

    }
    @Test
    public void isToyAgeAppropriateFalseTest(){
        Toy toy = new Toy("Кукла Маша",7,14,100);
        boolean actual = toy.isToyAgeAppropriate(5);
        Assert.assertFalse(actual);

    }
}
