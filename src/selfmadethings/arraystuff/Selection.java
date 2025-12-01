package selfmadethings.arraystuff;
import static selfmadethings.arraystuff.CommonSubroutine.*;

/**
 * Сортировка выбором
 * код взят из книги Роберта Седждвика
 * "Алгоритмы на Java"
 */

public class Selection {
    public static void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (less(arr[j], arr[minIndex]))
                    minIndex = j;
            changePlace(arr, i, minIndex);
        }
    }
}
