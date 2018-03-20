package ru.job4j.loop;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    /**
     * Складывает четные числа в указанном диапазоне.
     * @param start Стартовое число.
     * @param finish Конечное число.
     * @return Сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
