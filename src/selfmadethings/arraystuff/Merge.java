package selfmadethings.arraystuff;

import static selfmadethings.arraystuff.CommonSubroutine.*;

/**
 * Сортировка слиянием
 * код взят из книги Роберта Седждвика
 * "Алгоритмы на Java"
 */

public class Merge {
    private static int[] supportArray;

    public static void sortRecursion(int[] arr) {
        supportArray = new int[arr.length];
        halfSort(arr, 0, arr.length - 1);
    }

    public static void sortRise(int[] arr) {
        supportArray = new int[arr.length];
        for (int part = 1; part < arr.length; part = part + part)
            for (int lo = 0; lo < arr.length - part; lo += part + part)
                merge(arr, lo, lo + part - 1,
                        Math.min(lo + part + part - 1, arr.length - 1));

    }

    private static void halfSort(int[] arr, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        halfSort(arr, lo, mid);
        halfSort(arr, (mid + 1), hi);
        merge(arr, lo, mid, hi);
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
