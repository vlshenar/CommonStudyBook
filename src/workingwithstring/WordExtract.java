package workingwithstring;

/**
 * вытаскивает слово из предложения по его порядковому номеру
 * либо последнее слово если номер превышает количество слов в предложении
 */

public class WordExtract {
    public static void main(String[] args) {
        String s = "Insert any sentence or quit for terminate";
        String word = extractWord(s, 6);
        System.out.println(word);
    }

    private static String extractWord(String s, int wordNum) {
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
}
