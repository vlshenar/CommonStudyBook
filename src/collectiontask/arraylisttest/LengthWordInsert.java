package collectiontask.arraylisttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать консольную программу, которая бы сортировала текст поданный ей
 * на стандартный вход по количеству символов в строке.
 */

public class LengthWordInsert {
    public static void main(String[] args) {
        SortedInsert<String> orderedBook = new SortedInsert<>(100);
        String sentence;

        //сравнивает строки по количеству символов
        LengthComparator comparator = new LengthComparator();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {

                System.out.println("Insert any sentence or quit for terminate");
                System.out.print("--> ");

                 while (true) {
                     sentence = reader.readLine();
                     if (sentence.equals("quit")) break;
                     else {
                         orderedBook.setItem(sentence, comparator);
                         System.out.println(orderedBook.getSortedList());
                            System.out.print("--> ");
                     }
                 }
                } catch (IOException e) {
                     throw new RuntimeException(e);
        }
    }
}
