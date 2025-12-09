package selfmadethings;

import selfmadethings.arraystuff.RandNumbers;
import selfmadethings.arraystuff.Splitter;

import java.util.Arrays;

/**
 * Разбиение массива на 2 или 3 части
 */

public class SplitArrayTest {
    public static void main(String[] args) {
        int[] arr1 = {2, 36, 5, 21, 8, 13, 11, 20, 5, 4, 1};
        int[] arr1Copy = Arrays.copyOf(arr1, arr1.length);

        int[] arr2 = RandNumbers.getBlock(20, 20);
        int[] arr2Copy = Arrays.copyOf(arr2, arr2.length);

        int breakPoint1 = 2;
        int breakPoint2 = 5;

        //разбиение методом, использующим вспомогательный массив
        System.out.println(Arrays.toString(arr1));
        System.out.println("Break point value = " + arr1[breakPoint1]);
        Splitter.splitV1(arr1, breakPoint1);
        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println(Arrays.toString(arr2));
        System.out.println("Break point value = " + arr2[breakPoint2]);
        Splitter.splitV1(arr2, breakPoint2);
        System.out.println(Arrays.toString(arr2) + "\n");

        //разбиение методом без вспомогательного массива
        System.out.println(Arrays.toString(arr1Copy));
        System.out.println("Break point value = " + arr1Copy[breakPoint1]);
        Splitter.splitV2(arr1Copy, breakPoint1);
        System.out.println(Arrays.toString(arr1Copy) + "\n");

        System.out.println(Arrays.toString(arr2Copy));
        System.out.println("Break point value = " + arr2Copy[breakPoint2]);
        Splitter.splitV2(arr2Copy, breakPoint2);
        System.out.println(Arrays.toString(arr2Copy));
    }
}
