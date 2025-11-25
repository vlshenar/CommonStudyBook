package selfmadethings.arraystuff;

public class BinarySearch {
    public static int search(int value, int[] arr) {
        int left = 0;
        int right = arr.length -1;
        int index;
        while (left <= right) {
            index = left + (right - left)/2;
            if (arr[index] == value) {
                return index;
            }
            else if (arr[index] < value) {
                left = index + 1;
            }
            else {
                right = index - 1;
            }
        }
        return -1;
    }
}
