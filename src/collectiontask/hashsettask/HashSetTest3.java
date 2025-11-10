package collectiontask.hashsettask;

import java.util.HashSet;

/**
 * 10. Напишите Java-программу для сравнения двух хэш-наборов.
 */

public class HashSetTest3 {
    public static void main(String[] args) {
        Items items = new Items();
        HashSet<String> set1 = new HashSet<>(items.getBound(5));
        HashSet<String> set2 = new HashSet<>(items.getBound(4));
        HashSet<String> set3 = new HashSet<>(new Items().getBound(5));

        System.out.println("Сравнение set1 и set2 " + set1.equals(set2));
        System.out.println("Сравнение set1 и set3 " + set1.equals(set3));
        System.out.println("Сравнение set2 и set3 " + set2.equals(set3));
    }
}
