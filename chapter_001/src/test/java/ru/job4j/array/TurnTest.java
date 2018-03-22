package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TurnTest {
    @Test
    public void arrayEvenReverse() {
        Turn turn = new Turn();
        int[] testArray = {35, 2, 12, 3, 108, 224};
        int[] result = turn.back(testArray);
        int[] expected = {224, 108, 3, 12, 2, 35};
        assertThat(result, is(expected));
    }

    @Test
    public void arrayOddReverse() {
        Turn turn = new Turn();
        int[] testArray = {87, 43, 2, 12, -7};
        int[] result = turn.back(testArray);
        int[] expected = {-7, 12, 2, 43, 87};
        assertThat(result, is(expected));
    }

}
