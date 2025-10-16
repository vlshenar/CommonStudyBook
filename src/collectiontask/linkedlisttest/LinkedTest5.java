package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;
import static collectiontask.linkedlisttest.LinkedTest3.getDataOfList;
/**
 * 15. Напишите программу на Java, которая поменяет два элемента в связанном списке.
 */

public class LinkedTest5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(fruits));

        //задание 15
        System.out.println(getDataOfList(list));
        System.out.println("Элементы с номерами 3 и 6 меняются на onion и potato");
        list.set(3, "onion"); list.set(6, "potato");
        System.out.println(getDataOfList(list));
    }
}
