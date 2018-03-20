package array;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square {

    /**
     * Возвеедение чисел из массива в квадрат.
     * @param bound До какого числа возводить в квадрат.
     * @return Квадраты.
     */
    public int[] calculate(int bound) {
        int[] squares = new int[bound];
        for (int i = 0; i < bound; i++) {
            squares[i] = (i+1) * (i+1);
        }
        return squares;
    }
}
