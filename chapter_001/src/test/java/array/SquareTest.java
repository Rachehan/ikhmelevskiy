package array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    @Test
    public void whenFiveThenOneFourNineSixteenTwentyFive() {
        Square square = new Square();
        int[] expected = {1, 4, 9, 16, 25};
        int[] received = square.calculate(5);
        assertArrayEquals(expected, received);
    }
}
