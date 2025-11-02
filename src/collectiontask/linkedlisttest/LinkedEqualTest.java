package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;
/**
 * 24. Напишите программу на Java для сравнения двух связанных списков.
 */

public class LinkedEqualTest {
        private static boolean listEquals(List<String> list1, List<String> list2) {
            boolean equal = true;
            if(!(list1.size() == list2.size())) {
                equal = false;
            }
            for (int i = 0; i < list1.size(); i++) {
                if(!(list1.get(i).equals(list2.get(i))))
                    equal = false;
            }
            return equal;
        }

    public static void main(String[] args) {
        LinkedList<String> fruitList1 = new LinkedList<>(Arrays.asList(fruits));
        LinkedList<String> fruitList2 = (LinkedList<String>)fruitList1.clone();

        System.out.println("Is fruitList1 equals fruitList2? " + listEquals(fruitList1, fruitList2));

        fruitList1.set(6, "cabbage");

        System.out.println("Is fruitList1 equals fruitList2? " + listEquals(fruitList1, fruitList2));
    }
}
