package collectiontask.arraylisttest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Написать программу для поиска элемента в ArrayList
 */

public class ItemFinder {

    //Находит элемент в списке по его имени, пробегая по всему списку
    public static String findItem(String item, ArrayList<String> list) {

        //выводится, если не найден ни один элемент
        String defaultResult = "item not found";

        //выводится, если найден хотя бы один элемент
        StringBuilder successResult = new StringBuilder("item number(s): ");

        //ложь, если найден хотя бы один элемент
        boolean notFound = true;

        //если находит элемент, то добавляет его в successResult
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(item)) {
                successResult.append(i);
                successResult.append(" ");
                notFound = false;
            }
        return (notFound) ? defaultResult : successResult.toString().trim();
    }

    public static void main(String[] args) throws IOException {

        //пустой списочный массив
        ArrayList<String> itemBox = new ArrayList<>();

        //имя файла для заполнения списка
        String fileName = "src/resources/items.txt";

        String temporaryItem;   //служебная строка для заполнения списка

        // поток ввода из файла
        BufferedReader bfr = new BufferedReader(new FileReader(fileName));

        //заполнение списочного массива из файла
        while ((temporaryItem = bfr.readLine()) != null)
            itemBox.add(temporaryItem.trim());

        //закрытие потока чтения файла и открытие потока чтения с консоли
        bfr.close();

        //открытие потока ввода с консоли для пользователя
        bfr = new BufferedReader(new InputStreamReader(System.in));

        //введите название предмета
        System.out.println("Enter item's name or 'end' for quit");
        while (!(temporaryItem = bfr.readLine()).equals("end")) {
            System.out.println(findItem(temporaryItem, itemBox));
            System.out.println("Enter item's name or 'end' for quit");
        }
        bfr.close();
    }
}
