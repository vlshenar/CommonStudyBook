package collectiontask.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Напишите Java-программу для обновления определенного
 * элемента массива по заданному элементу.
 */

public class ItemSetTest {
    public static void main(String[] args) {

        //чтобы не вводить в ручную списочный массив
        //воспользуюсь разбиением строки регулярным выражением
        String fruits = "banana orange apple kiwi melon pear mango";
        ArrayList<String> fruitBuscket = new ArrayList<>(
                Arrays.asList(fruits.split("\\s")));

        //вывод исходного списка
        System.out.println("Массив до замены\n" + fruitBuscket);

        fruitBuscket.set(3, "lemon");    //замена элемента

        //вывод результата
        System.out.println("После замены\n" + fruitBuscket);

    }
}
