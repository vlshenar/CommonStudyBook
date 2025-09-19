package collectiontask.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Напишите программу на Java для перемешивания элементов в списке массивов.
 */
public class ArrayMixElements {

    //строка для заполнения массива-списка
    private static String arrWord = "Напишите программу на Java для перемешивания элементов в списке массивов";

    public static void main(String[] args) {

        //генератор случайных чисел
        Random rand = new Random(997);

        int index;  //случайный индекс

        int listSize;   //размер массива-списка

        String tmpWord;

        //исходный список-массив
        ArrayList<String> forMixingList = new ArrayList<>(
                Arrays.asList(arrWord.split("\\s"))
        );

        //вычисление размера списка
        listSize = forMixingList.size();



        //вывод исходного списка
        System.out.println(forMixingList + "\nА теперь перемешанный случайным образом");

        //перемешивание списка
            for (int i = 0; i < listSize; i++) {
                index = rand.nextInt(listSize);
                tmpWord = forMixingList.remove(i);
                forMixingList.add(index, tmpWord);
            }


        //вывод перемешанного случайным образом списка
        System.out.println(forMixingList);
    }
}
