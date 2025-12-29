package collectiontask.treemaptest;

import collectiontask.arraylisttest.CaseIgnoredComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Написать консольную программу, которая бы сортировала текст поданный ей
 * на стандартный вход по алфавиту, игнорируя регистр.
 */
//версия, использующее дерево
public class AlphabetInsertV4 {
    public static void main(String[] args) {
        String sentence;
        TreeMap<String, String> map = new TreeMap<>(new CaseIgnoredComparator());

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        )) {
            System.out.print("Insert sentence or quit for exit \n-->");
            while (true) {
                sentence = reader.readLine();
                if (sentence.equals("quit")) break;
                map.put(sentence, sentence);
                System.out.println(map.values());
                System.out.print("-->");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
