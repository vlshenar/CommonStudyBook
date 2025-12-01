package selfmadethings.arraystuff;

/**
 * Абстракции операций сравнения и обмена элементов местами
 */

public class CommonSubroutine {
     static boolean less (int firstTerm, int secondTerm) {
        return firstTerm <= secondTerm;
    }

     static void changePlace (int[] arr, int firstTerm, int secondTerm) {
        int temporaryTerm = arr[firstTerm];
        arr[firstTerm] = arr[secondTerm];
        arr[secondTerm] = temporaryTerm;
    }

     static void changePlace(char[] arr, int firstPlace, int secondPlace) {
        char temporaryTerm = arr[firstPlace];
        arr[firstPlace] = arr[secondPlace];
        arr[secondPlace] = temporaryTerm;
    }
}
