package collectiontask.arraylisttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Демонстрация работы итератора
 */

public class ArrayTest {
    public static void main(String[] args) throws IOException {
        //пустой лист
        List<String> list = new ArrayList<>();

        //буферизированный поток ввода с консоли
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        String s;
        System.out.println("Введите что-нибудь или end для завершения ввода");
        while (!(s = in.readLine()).equals("end")) {
            list.add(s);
        }

        //вызов итератора
        ListIterator<String> iter = list.listIterator();

        //итератор пробегает по всему списку,
        //по ходу меняя регистр введенных слов
        while (iter.hasNext()) {
            s = iter.next().toUpperCase();
            iter.remove();
            iter.add(s);
        }

        //вывод
        System.out.println("Вывод списка\n" + list);
        in.close();
    }
}
