package collectiontask.hashsettask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 6. Напишите Java-программу для клонирования хеш-набора в другой хеш-набор.
 * 7. Напишите Java-программу для преобразования хэш-набора в массив.
 * 8. Напишите Java-программу для преобразования хэш-набора в набор деревьев.
 * 9. Напишите программу на Java для преобразования хэш-набора в List / ArrayList.
 */

public class HashSetTest2 {
    public static void main(String[] args) {
        Items items = new Items();

        //задание 6
        HashSet<String> originalSet = new HashSet<>(items.getBound(6));
        HashSet<String> copySet = (HashSet<String>) originalSet.clone();
        //вывод набора-оригинала и его копии
        System.out.println("6) " + originalSet + "\n" + copySet);

        //задание 7
        String[] fromHashSet = originalSet.toArray(new String[0]);
        System.out.print("7) ");
        for(String s: fromHashSet) System.out.print(s + " ");

        //задание 8
        TreeSet<String> treeSet = new TreeSet<>(originalSet);
        System.out.println("\n8) " + treeSet);

        //задание 9
        ArrayList<String> list = new ArrayList<>(copySet);
        System.out.println("9) " + list);
    }
}
