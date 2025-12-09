package collectiontask.arraylisttest;

import java.util.Comparator;

/**
 * сравнивает строки в алфавитном порядке,
 * игнорируя регистра
 */

public class CaseIgnoredComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.compareToIgnoreCase(second);
    }
}
