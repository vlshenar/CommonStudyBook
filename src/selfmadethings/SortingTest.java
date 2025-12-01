package selfmadethings;

import selfmadethings.arraystuff.*;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        int numberOfElements = 32768;
       int[] originalArr = RandNumbers.getBlock(numberOfElements, 300000);
       int[] arr1 = Arrays.copyOf(originalArr, originalArr.length);
       int[] arr2 = Arrays.copyOf(originalArr, originalArr.length);
       int[] arr3 = Arrays.copyOf(originalArr, originalArr.length);
       int[] arr4 = Arrays.copyOf(originalArr, originalArr.length);

       StopWatch timer = new StopWatch();
       Selection.sort(arr1);
       double selectionWorkingTime = timer.elapsedTime();

       timer = new StopWatch();
       Insertion.sort(arr2);
       double insertionWorkingTime = timer.elapsedTime();

       timer = new StopWatch();
       Shell.sort(arr3);
       double shellWorkingTime = timer.elapsedTime();

       timer = new StopWatch();
        Merge.sortRecursion(arr4);
        double mergeWorkingTime = timer.elapsedTime();


        System.out.println(Arrays.toString(originalArr) + "\nsorted array\n" + Arrays.toString(arr4));
        System.out.println("Массив целых чисел размером в " + numberOfElements + " элементов");
        System.out.println("Время работы сортировки выбором: " + selectionWorkingTime +
                "\nВремя работы сортировки вставками: " + insertionWorkingTime +
                "\nВремя работы сортировки Шелла: " + shellWorkingTime +
                "\nВремя работы сортировки слиянием: " + mergeWorkingTime);
    }
}
