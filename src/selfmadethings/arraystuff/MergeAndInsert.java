package selfmadethings.arraystuff;

import static selfmadethings.arraystuff.CommonSubroutine.changePlace;
import static selfmadethings.arraystuff.CommonSubroutine.less;

/**
 * Сортировка слиянием, объединенная
 * с сортировкой вставками
 */

public class MergeAndInsert {
    private static int[] supportArray;

    public static void sort (int[] arr) {
        supportArray = new int[arr.length];
        halfSort(arr, 0, arr.length - 1);
    }

    private static void halfSort (int[] arr, int lo, int hi) {
        if (hi - lo <= 4) { //если длина подмассива меньше или равна 4
            //вызывается сортировка вставками
            insertSort(arr, lo, hi);
            return;
        }
        int mid = lo + (hi - lo)/2;
        halfSort (arr, lo, mid);
        halfSort (arr, mid+1, hi);
        merge(arr, lo, mid, hi);
    }

    //метод сортировки вставками
    private static void insertSort (int[] arr, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            for (int j = i; j > lo && less(arr[j], arr[j - 1]); j--)
                changePlace(arr, j, j - 1);
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
        int firstPointer = lo;
        int secondPointer = mid + 1;
        for (int i = lo; i <= hi; i++) supportArray[i] = arr[i];
        //магия слияния
        for (int k = lo; k <= hi; k++) {
            if (firstPointer > mid)
                arr[k] = supportArray[secondPointer++];

            else if (secondPointer > hi)
                arr[k] = supportArray[firstPointer++];

            else if (less(supportArray[firstPointer], supportArray[secondPointer]))
                arr[k] = supportArray[firstPointer++];

            else
                arr[k] = supportArray[secondPointer++];
        }
    }
}
