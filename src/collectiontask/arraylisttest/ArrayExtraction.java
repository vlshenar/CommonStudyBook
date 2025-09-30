package collectiontask.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Напишите программу на Java для извлечения части списка массивов.
 */

public class ArrayExtraction {
    private final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
    "banana", "pear", "watermelon", "garnet", "pineapple"};

    public static void main(String[] args) {
        int startExtract = 2;   //начало извлекаемой части
        int endExtract = 7;     //конец извлекаемой части

        //список, из которого извлекают часть
        ArrayList<String> fruitBusket = new ArrayList<>(Arrays.asList(fruits));

        //извлеченный список
        ArrayList<String> part = new ArrayList<>();

        for(int i = startExtract; i <= endExtract; i++)
            part.add(fruitBusket.get(i));

        System.out.println(part);
    }
}
