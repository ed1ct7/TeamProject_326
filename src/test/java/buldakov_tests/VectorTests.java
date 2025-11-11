package buldakov_tests;

import allclasses.buldakov.Vector;
import org.junit.Assert;
import org.junit.Test;

public class VectorTests {
    @Test
    public void VectorGetLengthTest() {
        double expected = 5;
        Vector vector = new Vector(3,4);
        double actual = vector.getLength();
        Assert.assertEquals(expected, actual, 0.001);
    }
}
