package selfmadethings.arraystuff;
import static selfmadethings.arraystuff.CommonSubroutine.*;

/**
 * Сортировка Шелла
 * код взят из книги Роберта Седждвика
 * "Алгоритмы на Java"
 */

public class Shell {
    public static void sort(int[] arr) {
        int len = arr.length;
        int h = 1;
        while(h < len/3) h = 3*h +1;
        while (h >= 1) {
            for (int i = h; i < len; i++)
                for (int j = i; j >= h && less(arr[j], arr[j-h]); j -= h)
                    changePlace(arr, j, j-h);
            h = h/3;
        }
    }
}
