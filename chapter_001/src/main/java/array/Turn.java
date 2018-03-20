package array;

/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {

    /**
     * Метеод переворачивает массив в обратном порядке.
     * @param array Исходный массив.
     * @return Перевернутый массив.
     */
    public int[] back(int[] array) {
        int temp;
        int lastElement = array.length;
        for (int i = 0; i < lastElement / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
