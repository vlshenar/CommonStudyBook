package selfmadethings.arraystuff;

/**
 * слияние двух отсортированных массивов
 * методом двух указателей
 */

public class ArrayFusion {
    public static int[] merge(int[] arr1, int[] arr2) throws NullPointerException {
        if (arr1 == null || arr2 == null)
            throw new NullPointerException();
        else {
            int[] result = new int[arr1.length + arr2.length];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < arr1.length || j < arr2.length) {
                if (i == arr1.length) {
                    result[k++] = arr2[j++];
                } else if (j == arr2.length) {
                    result[k++] = arr1[i++];
                } else if (arr1[i] > arr2[j])
                    result[k++] = arr2[j++];
                else if (arr1[i] <= arr2[j])
                    result[k++] = arr1[i++];
            }
            return result;
        }
    }
}
