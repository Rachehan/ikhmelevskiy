package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    @Test
    public void sortArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] testArray = {101, 3, 36, 113, 12, 5};
        int[] result = bubbleSort.sort(testArray);
        int[] expected = {3, 5, 12, 36, 101, 113};
        assertThat(result, is(expected));
    }
}
