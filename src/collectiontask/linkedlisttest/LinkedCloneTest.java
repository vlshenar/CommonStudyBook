package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;
import static collectiontask.linkedlisttest.LinkedTest3.getDataOfList;

/**
 * 18. Напишите программу на Java, чтобы клонировать связанный список в другой связанный список.
 */

public class LinkedCloneTest {
    public static void main(String[] args) {
        //исходный список
        LinkedList<String> sourceList = new LinkedList<>(Arrays.asList(fruits));

        LinkedList<String> copyList = (LinkedList<String>) sourceList.clone();

        sourceList.set(4, "ONION");

        System.out.println("sourceList: " + getDataOfList(sourceList) + "\ncopyList: " + getDataOfList(copyList));
    }
}
