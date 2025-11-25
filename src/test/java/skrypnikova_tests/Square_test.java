package skrypnikova_tests;
import allclasses.skrypnikova.Square;
import org.junit.Test;
import static org.junit.Assert.*;


public class Square_test
{
    @Test
    public  void square_area_test()
    {
        Square square = new Square(7);
        assertEquals(49, square.area(), 0.0001);
    }

    @Test
    public  void square_perimetr_test()
    {
        Square square = new Square(7);
        assertEquals(28, square.perimeter(), 0.0001);
    }

    @Test
    public  void square_diagonal_test()
    {
        Square square = new Square(7);
        assertEquals(9.8995, square.diagonal(), 0.0001);
    }
}
