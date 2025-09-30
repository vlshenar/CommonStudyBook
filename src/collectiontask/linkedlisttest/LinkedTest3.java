package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 11. Напишите Java-программу для отображения элементов и их позиций в связанном списке.
 */

public class LinkedTest3 {
    private final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
            "banana", "pear", "watermelon", "garnet", "pineapple"};

    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>(Arrays.asList(fruits));
        System.out.println(getDataOfList(fruitList));

    }

    //отображает позицию элемента и сам элемент
    static String getDataOfList(List<String> list) {
        int place = 0;
        StringBuilder builder = new StringBuilder();
        for (String s : list) {
            builder.append(place).append(" - ");
            builder.append(s).append("; ");
            place++;
        }
        return builder.toString();
    }
}
