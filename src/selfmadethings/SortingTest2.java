package selfmadethings;

import selfmadethings.arraystuff.Merge;
import selfmadethings.arraystuff.RandNumbers;
import selfmadethings.arraystuff.Shell;

import java.util.Arrays;

/**
 * Тест сортировки слиянием
 */

public class SortingTest2 {
    public static void main(String[] args) {
        int[] arr = RandNumbers.getBlock(1048576, 1048576);
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        //восходящая сортировка
        StopWatch watch = new StopWatch();
        Merge.sortRise(arr);
        double stopTime = watch.elapsedTime();
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.println("\n" + stopTime);

        //рекурсивная сортировка слиянием
        watch = new StopWatch();
        Merge.sortRecursion(arr2);
        stopTime = watch.elapsedTime();
        System.out.println("Recursion sort " + stopTime);
    }
}
