package gulyaev_tests;

import allclasses.gulyaev.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class Testmethod1 {
    @Test
    public void rectangleGetSquareTest(){
        int expected = 6;
        Rectangle rec1 = new Rectangle(2, 3);
        int actual = rec1.Square();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rectangleGetPerimetr(){
        int expected = 10;
        Rectangle rec1 = new Rectangle(2,3);
        int actual = rec1.Perimeter();
        Assert.assertEquals(expected, actual);
    }
}
