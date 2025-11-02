package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;

/**
 * 22. Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
 */

public class LinkedFindTestV2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(fruits));

        System.out.println("Is list contain onion? " + list.contains("Onion"));
        System.out.println("Is list contain banana? " + list.contains("banana"));
    }
}
