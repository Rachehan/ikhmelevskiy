package ru.job4j.array;

/**
 * Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {

    /**
     * Метод сортировки массива пузырьком.
     * @param array Исходный массив.
     * @return Сортированный массив.
     */
    public int[] sort(int[] array) {
        int temp;
        // внешний цикл контролирует количество проходов по всему массиву
        for (int i = 0; i < array.length; i++ ) {
            // внутренний цикл сдвигает более крупные числа максимально возможно вправо
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
