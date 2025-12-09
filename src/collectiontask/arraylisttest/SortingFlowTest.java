package collectiontask.arraylisttest;

/**
 * проверка работы сортированного ввода
 */

public class SortingFlowTest {
    final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
            "banana", "pear", "watermelon", "Garnet", "pineapple"};

    public static void main(String[] args) {
        //ввод чисел
        Integer[] arr = {3, 9, -1, 4, 0, 7, -12, 8, 6, 0, 2, 21, 5, 1};
        SortedInsert<Integer> sortList = new SortedInsert<>();
        for (Integer i : arr) sortList.setItem(i);
        System.out.println(sortList.getSortedList());

        //ввод слов по алфавиту
        SortedInsert<String> fruitSortedList = new SortedInsert<>();
        for (String s : fruits) fruitSortedList.setItem(s);
        System.out.println(fruitSortedList.getSortedList());

        //ввод слов по количеству символов
        fruitSortedList = new SortedInsert<>();
        for (String s : fruits) fruitSortedList.setItem(s, new LengthComparator().reversed());
        System.out.println(fruitSortedList.getSortedList());
    }
}
