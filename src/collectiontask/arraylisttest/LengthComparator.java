package collectiontask.arraylisttest;

import java.util.Comparator;

/**
 * сравнивает строки по количеству символов
 */

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int lenFirst = first.length();
        int lenSecond = second.length();
        return Integer.compare(lenFirst, lenSecond);
    }
}
