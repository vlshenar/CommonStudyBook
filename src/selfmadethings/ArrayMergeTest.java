package selfmadethings;

import selfmadethings.arraystuff.ArrayFusion;
import selfmadethings.arraystuff.BinarySearch;

import java.util.Arrays;

/**
 * слияние двух отсортированных массивов
 * методом двух указателей
 * и бинарный поиск
 */

public class ArrayMergeTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {1, 4, 6, 8, 12, 14, 16};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arrayResult = ArrayFusion.merge(arr1, arr2);
        System.out.println(Arrays.toString(arrayResult));

        System.out.println("place of value: " + BinarySearch.search(11, arrayResult));
    }
}
