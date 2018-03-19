package ru.job4j.max;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /** Вычисляет максимум.
     * @param first Первое число.
     * @param second Второе число.
     * @return Максимум.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }

}
