package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;

/**
 * 22. Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
 */

public class LinkedFindTest {
    public static void main(String[] args) {

        LinkedList<String> fruitList = new LinkedList<>(Arrays.asList(fruits));

        System.out.println("Is fruitList contain banana? " + findItem("banana", fruitList));
        System.out.println("Is fruitList contain onion? " + findItem("onion", fruitList));
    }

    //поиск интересующего элемента прямым перебором
    static boolean findItem(String item, LinkedList<String> list) {
        boolean found = false;
        for (String s : list)
            if (item.equals(s)) {
                found = true;
                break;
            }
        return found;
    }
}
