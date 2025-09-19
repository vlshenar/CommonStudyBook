package collectiontask.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Напишите программу для обращения элементов в списке массивов.
 */
public class ArrayRevertion {

    //для быстрого заполнения элементов воспользуюсь строкой
    private static String arrWord = "Напишите программу для обращения элементов в списке массивов";

    public static void main(String[] args) {

        //список-массив, инициация и заполнение из строки
        ArrayList<String> wordList = new ArrayList<>(
                Arrays.asList(arrWord.split("\\s"))
        );

        //результат работы программы - обращенный список
        ArrayList<String> resultList = new ArrayList<>();

        //вывод исходного списка-массива
        System.out.println(wordList);

        //процесс обращения списка-массива
        for (String word : wordList) resultList.add(0, word);

        //вывод результата
        System.out.println(resultList);
    }
}
