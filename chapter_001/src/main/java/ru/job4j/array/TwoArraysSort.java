package ru.job4j.array;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TwoArraysSort {
    /**
     * Метод сортирует значения из двух отсортированных массивов в третий.
     * @param first
     * @param second
     * @return
     * bigArray - новый отсортированный массив
     * bufer -
     */
    public int[] doubleSort(int[] first, int[] second) {
        int[] bigArray = new int[first.length + second.length];
        int firsti = 0; // счетчик по первому массиву
        int secondi = 0; // счетчик по второму массиву

        for (int i = 0; i < bigArray.length; i++) {
            if (firsti > first.length - 1) {
                int bufer = second[secondi];
                bigArray[i] = bufer;
                secondi++;
            } else if (secondi > second.length - 1) {
                int bufer = first[firsti];
                bigArray[i] = bufer;
                firsti++;
            } else if (first[firsti] < second[secondi]) {
                int bufer = first[firsti];
                bigArray[i] = bufer;
                firsti++;
            } else {
                int bufer2 = second[secondi];
                bigArray[i] = bufer2;
                secondi++;
            }
        }
        return bigArray;
    }
}
