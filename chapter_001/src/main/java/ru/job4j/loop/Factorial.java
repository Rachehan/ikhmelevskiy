package ru.job4j.loop;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {

    /**
     * Рассчет факториала.
     * @param n До какого числа рассчитывать факториал.
     * @return Факториал.
     */
    public int calc(int n) {
        int fact = 1;
        if (n == 0) {
            return fact;
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

}
