package selfmadethings;

import selfmadethings.arraystuff.Merge;
import selfmadethings.arraystuff.MergeAndInsert;

import java.util.Arrays;

/**
 * Демонстрация работы сортировки слиянием
 * и слиянием со вставками
 */

public class SortingTest3 {
    public static void main(String[] args) {
        int[] arr = {12, 9, 1, 4, 7, 11, 0};
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.toString(arr));
        Merge.sortRecursion(arr);       //рекурсивное слияние
        System.out.println(Arrays.toString(arr));

        MergeAndInsert.sort(arr2);      //слияние со вставками
        System.out.println(Arrays.toString(arr2));
    }
}
