package buldakov_tests;

import allclasses.buldakov.Vector;
import org.junit.Assert;
import org.junit.Test;

public class VectorTests {
    @Test
    public void vectorGetLengthTest1() {
        double expected = 5;
        Vector vector = new Vector(3,4);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void vectorGetLengthTest2() {
        double expected = 1.4142;
        Vector vector = new Vector(-1,-1);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void vectorGetLengthTest3() {
        double expected = 2.5;
        Vector vector = new Vector(1.5,-2);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
}
