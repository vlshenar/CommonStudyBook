package collectiontask.linkedlisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static collectiontask.linkedlisttest.LinkedTest1.fruits;
/**
 * 23. Напишите программу на Java для преобразования связанного списка в список массивов.
 */

public class LinkedArrayTransvers {
    public static void main(String[] args) {
        //связный список
        LinkedList<String> list = new LinkedList<>(Arrays.asList(fruits));

        //список-массив
        ArrayList<String> arrayList = new ArrayList<>(list);

        //вывод на консоль
        System.out.println(arrayList);
    }
}
