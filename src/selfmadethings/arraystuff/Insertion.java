package selfmadethings.arraystuff;
import static selfmadethings.arraystuff.CommonSubroutine.*;

/**
 * Сортировка вставками
 * код взят из книги Роберта Седждвика
 * "Алгоритмы на Java"
 */

public class Insertion {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            for (int j = i; j > 0 && less(arr[j], arr[j-1]); j--)
                changePlace(arr, j, j-1);
    }

    public static void sort (char[] arr) {
        for (int i = 1; i < arr.length; i++)
            for (int j = i; j > 0 && less(arr[j], arr[j-1]); j--)
                changePlace(arr, j, j-1);
    }
}
