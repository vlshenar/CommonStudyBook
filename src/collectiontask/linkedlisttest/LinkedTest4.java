package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 12. Напишите Java-программу для удаления указанного элемента из связанного списка.
 * 13. Напишите программу на Java для удаления первого и последнего элемента из связанного списка.
 */

public class LinkedTest4 {
    private final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
            "banana", "pear", "watermelon", "garnet", "pineapple"};

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(fruits));

        System.out.println(LinkedTest3.getDataOfList(list));
        //задание 12
        list.remove(5);

        System.out.println("Удаление элемента номер 5");
        System.out.println(LinkedTest3.getDataOfList(list));

        //задание 13
        list.removeFirst(); list.removeLast();
        System.out.println("Удаление первого и последнего элемента из списка\n" +
                LinkedTest3.getDataOfList(list));
    }
}
