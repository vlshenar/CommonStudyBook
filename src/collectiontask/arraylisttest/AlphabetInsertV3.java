package collectiontask.arraylisttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать консольную программу, которая бы сортировала текст поданный ей
 * на стандартный вход, используя алфавитный порядок слова из предложения,
 * порядковый номер которого выбран заранее.
 */

public class AlphabetInsertV3 {
    public static void main(String[] args) {
        int wordNum;
        if (args.length != 0) wordNum = Integer.parseInt(args[0]);
        else wordNum = 1;
        SortedInsert<String> orderedBook = new SortedInsert<>(100);
        String sentence;

        //сравнивает предложения по выбранному слову
        KeyWordComparator comparator = new KeyWordComparator(wordNum);

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {

                 System.out.println("Insert any sentence contains more word then "
                      + wordNum + " or quit for terminate");
                 System.out.print("--> ");

                 while (true) {
                     sentence = reader.readLine();
                     if (sentence.equals("quit")) break;
                     else {
                         orderedBook.setItem(sentence, comparator);
                          for (String s : orderedBook.getSortedList())
                            System.out.println(s);
                          System.out.print("--> ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
