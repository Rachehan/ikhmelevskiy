package ru.job4j.array;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {

    /**
     * Метод заполняет матрицу в виде таблицы умножения.
     * @param size Диапазон таблицы умножения (до size * size).
     * @return Таблица умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        // внешний цикл проходит по столбцу
        for (int i = 1; i <= size; i++) {
            // внутренний цикл проходит по строке
            for (int j = 1; j <= size; j++) {
                // ячейке присваивается произведение индексов строки и столбца
                table[i-1][j-1] = i * j;
            }
        }
        return table;
    }
}
