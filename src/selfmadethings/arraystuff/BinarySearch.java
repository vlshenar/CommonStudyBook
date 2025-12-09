package selfmadethings.arraystuff;

public class BinarySearch {
    public static int search(int value, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int index;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (arr[index] == value) {
                return index;
            } else if (arr[index] < value) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
        return -1;
    }

    //recursion method
    public static int recSearch(int value, int[] arr) {
        return finder(value, arr, 0, arr.length - 1);
    }

    private static int finder(int value, int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == value) return mid;
        else if (right <= left) return -1;
        else if (arr[mid] > value) return finder(value, arr, left, mid - 1);
        else if (arr[mid] < value) return finder(value, arr, mid + 1, right);
        else return -1;
    }
}
