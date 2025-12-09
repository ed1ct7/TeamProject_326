package chemyakinatests;
import allclasses.chemyakina.Straight;
import org.junit.Test;
import static org.junit.Assert.*;

public class StraightTests {
    @Test
    public void testGetEquation() {
        Straight straight = new Straight(2.0, 3.0);
        assertEquals("y = 2.0x + 3.0", straight.getEquation());
    }

    @Test
    public void testGetIntersectionPoints() {
        Straight straight = new Straight(2.0, 4.0);
        assertEquals(-2.0, straight.getIntersectionOX(), 0.001);
        assertEquals(4.0, straight.getIntersectionOY(), 0.001);


        Straight horizontal = new Straight(0.0, 5.0);
        assertTrue(Double.isNaN(horizontal.getIntersectionOX()));
    }

    @Test
    public void testParallel() {
        Straight line1 = new Straight(2.0, 1.0);
        Straight line2 = new Straight(2.0, 5.0);
        Straight line3 = new Straight(3.0, 1.0);

        assertTrue(line1.isParallelTo(line2));
        assertFalse(line1.isParallelTo(line3));
    }

    @Test
    public void testIntersectionPoint() {
        Straight line1 = new Straight(2.0, 1.0);
        Straight line2 = new Straight(-1.0, 4.0);
        assertEquals("(1.0; 3.0)", line1.getIntersectionPoint(line2));

        // Тест для параллельных линий
        Straight line3 = new Straight(2.0, 1.0);
        Straight line4 = new Straight(2.0, 5.0);
        assertEquals("Прямые параллельны", line3.getIntersectionPoint(line4));
    }
}