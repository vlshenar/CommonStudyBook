package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;
import static collectiontask.linkedlisttest.LinkedTest3.getDataOfList;

/**
 * 17. Напишите программу на Java, чтобы объединить два связанных списка.
 */

public class LinkedUnionTest {
    //овощи
    static String[] vegetables = {"onion", "cabbage", "carrot", "eggplant", "pepper"};

    public static void main(String[] args) {

        LinkedList<String> fruitList = new LinkedList<>(Arrays.asList(fruits));
        LinkedList<String> vegList = new LinkedList<>(Arrays.asList(vegetables));

        System.out.println("fruitList: " + getDataOfList(fruitList));
        System.out.println("vegList: " + getDataOfList(vegList));

        LinkedList<String> unionList = new LinkedList<>(fruitList);
        unionList.addAll(vegList);

        System.out.println("unionList: " + getDataOfList(unionList));
    }
}
