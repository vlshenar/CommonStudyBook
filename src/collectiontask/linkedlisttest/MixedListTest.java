package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;
import static collectiontask.linkedlisttest.LinkedTest3.getDataOfList;

/**
 * 16. Напишите программу на Java, чтобы перемешать элементы в связанном списке.
 */

public class MixedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(fruits));
        Random rand = new Random(997);
        int listSize = list.size();
        int index;
        String tmp;

        //исходное состояние списка
        System.out.println("At begin\n" + getDataOfList(list));

        //перемешивание списка
        for (int i = 0; i < list.size(); i++) {
            index = rand.nextInt(listSize);
            tmp = list.remove(i);
            list.add(index, tmp);
        }

        //вывод перемешанного списка
        System.out.println("After mixing\n" + getDataOfList(list));
    }
}
