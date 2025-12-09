package collectiontask.arraylisttest;

import java.util.Comparator;

/**
 * сравнивает два предложения по слову, на которое указывает порядковый номер
 */

public class KeyWordComparator implements Comparator<String> {
    private int numberWordInSentence;

    public KeyWordComparator(int numberWordInSentence) {
        this.numberWordInSentence = numberWordInSentence;
    }

    //возвращает слово из предложения по его порядковому номеру
    //если номер превышает количество слов в предложении возвращает последнее слово
    //если номер равен нуль, то первое слово
    private String extractWord(String s) {
        int wordNum = numberWordInSentence;
        if (wordNum == 0) wordNum = 1;
        int beginWord = 0;
        int endWord = s.length();
        for (int i = 0; i < s.length() && wordNum > 0; i++) {
            if (s.charAt(i) == ' ' && wordNum > 1) {
                beginWord = i;
                wordNum--;
            } else if (s.charAt(i) == ' ' && wordNum == 1) {
                endWord = i;
                wordNum--;
            }
        }
        return s.substring(beginWord, endWord).trim();
    }

    @Override
    public int compare(String first, String second) {
        String subFirst = extractWord(first);
        String subSecond = extractWord(second);
        //сортировка по указанному в предложении слову в алфавитном порядке
        return subFirst.compareTo(subSecond);
    }
}
