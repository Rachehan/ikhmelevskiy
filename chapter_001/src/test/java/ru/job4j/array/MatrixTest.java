package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixTest {
    @Test
    public void whenFiveThenFromOneToNine() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(3);
        int[][] exp = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertThat(result, is(exp));
    }

}
