package ru.job4j.array;

import java.util.Arrays;
/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        // изначально предполагается, что все элементы уникальны
        int uniqueElements = array.length;
        // внешний цикл проходит по массиву
        for (int step = 0; step < uniqueElements; step++) {
            // внутренний цикл сравнивает элементы и сортирует их, если есть дубликаты
            for(int assess = step + 1; assess < uniqueElements; assess++) {

                if(array[step].equals(array[assess])) { // если элемент на очередном шаге является дубликатом
                    array[assess] = array[uniqueElements - 1]; // заменить его с последним
                    uniqueElements--; // количество уникальных эелементов уменьшить на 1
                    assess--; // уменьшить на 1 размер оцениваемой области массива
                }
            }
        }
        return Arrays.copyOf(array, uniqueElements);
    }
}
