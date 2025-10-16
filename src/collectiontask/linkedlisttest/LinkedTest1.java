package collectiontask.linkedlisttest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/***
 * 1. Напишите программу на Java, чтобы добавить указанный элемент в конец связанного списка.
 * 2. Напишите Java-программу для перебора всех элементов в связанном списке.
 * 3. Напишите Java-программу для итерации по всем элементам в связанном списке, начиная с указанной позиции.
 * 4. Напишите Java-программу для итерации связанного списка в обратном порядке.
 */

public class LinkedTest1 {
    final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
            "banana", "pear", "watermelon", "garnet", "pineapple"};

    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>(Arrays.asList(fruits));

        //1 задание - добавление в конец списка
        fruitList.addLast("mango");

        //2 задание - перебор всех элементов списка
        for(String s: fruitList) System.out.print(s + " ");

        //перевод строки
        System.out.println();

        //3 задание - итерация по всем элементам, начиная с указанного
        //возьму за начало элемент 4
        ListIterator<String> iterator = fruitList.listIterator(4);
        while(iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println();

        //4 задание - итерация в обратном порядке
        int size = fruitList.size();
        iterator = fruitList.listIterator(size);
        while(iterator.hasPrevious()) System.out.print(iterator.previous() + " ");
    }
}
