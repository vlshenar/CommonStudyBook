package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 5. Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке.
 * 6. Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции.
 * 7. Напишите Java-программу для вставки указанного элемента в начало связанного списка.
 * 8. Напишите Java-программу для вставки указанного элемента в конец связанного списка.
 */

public class LinkedTest2 {
    private final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
            "banana", "pear", "watermelon", "garnet", "pineapple"};

    public static void main(String[] args) {

        LinkedList<String> fruitList = new LinkedList<>(Arrays.asList(fruits));
        System.out.println("default list: " + fruitList);

        //задание 5
        fruitList.add(5, "mango");
        System.out.println("position №5 mango: " + fruitList);

        //задание 6
        LinkedList<String> firstPositionList = new LinkedList<>();
        LinkedList<String> lastPositionList  = new LinkedList<>();
        for(String s: fruits) {
            firstPositionList.addFirst(s);
            lastPositionList.addLast(s);
        }
        System.out.println("firstPositionList: " + firstPositionList);
        System.out.println("lastPositionList: " + lastPositionList);

        //задание 7
        fruitList.addFirst(fruitList.remove(7));
        System.out.println("moving element number 7 to begin: " + fruitList);

        //задание 8
        fruitList.addLast(fruitList.remove(3));
        System.out.println("moving element number 3 to end: " + fruitList);
    }
}
