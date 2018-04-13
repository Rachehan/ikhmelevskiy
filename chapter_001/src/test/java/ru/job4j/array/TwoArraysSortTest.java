package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TwoArraysSortTest {
    @Test
    public void whenTwoSortedArraysThenOneBigSortedArray() {
        TwoArraysSort tas = new TwoArraysSort();
        int[] firstArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int[] secondArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int[] resultArray = tas.doubleSort(firstArray, secondArray);
        assertThat(resultArray, is(expectedArray));
    }
}