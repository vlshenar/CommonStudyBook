package selfmadethings.arraystuff;

import static selfmadethings.arraystuff.CommonSubroutine.*;
/**
 * Версия сортировки Шелла, где шаг обмена элементов
 * не вычисляется, а задается массивом
 * (задание 2.1.11 из Р. Седжвика Алгоритмы Java)
 */

public class ShellV2 {
    private static int[] steps = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841};

    //эмпирическая последовательность Марцина Циура
    private static int[] stepsCiure = {1, 4, 10, 23, 57, 132, 301, 701, 1750};

    public static void sort(int[] arr) {
        int stepsLen = steps.length;
        int h = stepsLen - 1;
        while (steps[h] > arr.length) h--;
        while (h >= 0) {
            int step = steps[h];
            for (int i = step; i < arr.length; i ++)
                for (int j = i; j >= step && less(arr[j], arr[j - step]); j -= step)
                    changePlace(arr, j, j - step);
            h--;
        }
    }

    //Сортировка Шелла на эмпирической последовательности Марцина Циура
    public static void sortCiure (int[] arr) {
        int stepsLen = stepsCiure.length;
        int h = stepsLen - 1;
        while (stepsCiure[h] > arr.length) h--;
        while (h >= 0) {
            int step = stepsCiure[h];
            for (int i = step; i < arr.length; i ++)
                for (int j = i; j >= step && less(arr[j], arr[j - step]); j -= step)
                    changePlace(arr, j, j - step);
            h--;
        }
    }
}
