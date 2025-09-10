package collectiontask.arraylisttest;

import java.util.ArrayList;

/**
 * Напишите программу на Java для удаления
 * третьего элемента из списка массивов.
 */

public class ItemRemoveTest {
    public static void main(String[] args) {
        //создание пустого списочного массива
        ArrayList<Integer> numers = new ArrayList<>();

        //инициализация
        for (int i = 1; i <= 7; i++)
            numers.add(i);

        //вывод списка до удаления элемента
        System.out.println("Before removing\n" + numers);

        //удаление элемента
        numers.remove(2);

        //вывод результата
        System.out.println("After removing third element\n" + numers);
    }
}
