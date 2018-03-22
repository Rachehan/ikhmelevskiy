package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {
    @Test
    public void whenFindThenIndex() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FindLoop findLoop = new FindLoop();
        int expected = 5;
        int result = findLoop.indexOf(testArray, 6);
        assertThat(expected, is(result));
    }

    @Test
    public void whenNotFound() {
        int[] testArray = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        FindLoop findLoop = new FindLoop();
        int expected = -1;
        int result = findLoop.indexOf(testArray, 6);
        assertThat(expected, is(result));
    }
}
