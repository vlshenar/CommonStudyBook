package selfmadethings;

import selfmadethings.arraystuff.RandNumbers;
import selfmadethings.arraystuff.ShellV2;

import java.util.Arrays;

/**
 * Тест варианта сортировки Шелла, где шаг
 * берется из массива значений
 */

public class SortingTest4 {
    public static void main(String[] args) {
        int[] arr = RandNumbers.getBlock(50, 1000);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        ShellV2.sort(arr);
        System.out.println(Arrays.toString(arr));

        ShellV2.sortCiure(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
