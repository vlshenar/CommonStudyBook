package collectiontask.hashsettask;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 2. Напишите Java-программу для перебора всех элементов в хэш-списке.
 * 3. Напишите программу на Java, чтобы получить количество элементов в хэш-наборе.
 * 4. Напишите программу на Java, чтобы очистить хэш-набор.
 * 5. Напишите программу на Java, чтобы проверить, хэш-набор пуст или нет.
 */

public class HashSetTest1 {
    public static void main(String[] args) {
        Items items = new Items();
        HashSet<String> set = new HashSet<>(items.getBound(5));

        //задание 2
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");

        //задание 3
        System.out.println("\ncount = " + set.size());

        //задание 5
        System.out.println("this hashset is empty? " + set.isEmpty());

        //задание 4
        set.clear();

        //задание 5
        System.out.println("this hashset is empty? " + set.isEmpty());
    }
}
