package selfmadethings.arraystuff;

import static selfmadethings.arraystuff.CommonSubroutine.*;

public class Splitter {
    //разделение массива на 2 или 3 части с использованием
    //вспомогательного массива
    public static void splitV1(int[] arr, int breakPoint) {
        int value = arr[breakPoint];
        int[][] supportArr = new int[3][arr.length];    //вспомогательный массив
        int lowPart = 0;
        int equalPart = 0;
        int highPart = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < value) supportArr[0][lowPart++] = arr[i];
            else if (arr[i] > value) supportArr[2][highPart++] = arr[i];
            else supportArr[1][equalPart++] = arr[i];
        }
        for (int i = 0; i < lowPart; i++) arr[k++] = supportArr[0][i];
        for (int i = 0; i < equalPart; i++) arr[k++] = supportArr[1][i];
        for (int i = 0; i < highPart; i++) arr[k++] = supportArr[2][i];
    }

    //разделение массива на 2 или 3 части без вспомогательного массива
    public static void splitV2(int[] arr, int breakPoint) {
        for (int i = breakPoint - 1; i >= 0; i--)
            if (arr[i] > arr[breakPoint]) {
                changePlace(arr, breakPoint, i);
                breakPoint = i;
            }

        for (int j = breakPoint + 1; j < arr.length; j++) {
            if (arr[j] <= arr[breakPoint] && j - breakPoint == 1) {
                changePlace(arr, j, breakPoint);
                breakPoint = j;
            } else if (arr[j] <= arr[breakPoint]) {
                changePlace(arr, breakPoint, breakPoint + 1);
                breakPoint++;
                changePlace(arr, j, breakPoint - 1);
            }
        }
        int limit = breakPoint;
        for (int k = limit - 1; k > 0; k--)
            if (arr[k] == arr[breakPoint]) {
                changePlace(arr, k, breakPoint - 1);
                breakPoint--;
            }
    }
}
