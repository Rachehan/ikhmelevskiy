package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstBiggerSecond() {
        Max max = new Max();
        int result = max.max(5, 2, 17);
        assertThat(result, is(17));
    }
}
