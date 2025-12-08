package kulikovtests;

import allclasses.kulikov.Parallelogram;
import org.junit.Assert;
import org.junit.Test;

public class parallelogramtests {
    @Test
    public void parallelogramSquareTest1(){
        double expected = 14;
        Parallelogram parallelogram = new Parallelogram(2,7);
        double actual = parallelogram.getSquare();
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void parallelogramSquareTest2(){
        double expected = 10.6;
        Parallelogram parallelogram = new Parallelogram(4,2.65);
        double actual = parallelogram.getSquare();
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void parallelogramSquareTest3(){
        double expected = 8.4;
        Parallelogram parallelogram = new Parallelogram(3,2.8);
        double actual = parallelogram.getSquare();
        Assert.assertEquals(expected, actual, 0.0001);
    }
}