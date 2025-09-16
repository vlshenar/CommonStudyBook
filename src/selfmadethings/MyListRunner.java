package selfmadethings;

import selfmadethings.mylist.ElasticArray;
import selfmadethings.mylist.ElasticIterator;

/**
 * Программа демонстрирует работу учебной реализации
 * массива-списка ElasticArray
 */

public class MyListRunner {

    //Каждый символ строки str заносится в список-массив
    //ElasticArray, где вызванный итератор удаляет или
    //заменяет некоторые символы
    public static void main(String[] args) {
        //строка - источник символов для объектов Character
        String str = "Масло из вологодского молока.";
        StringBuilder sb = new StringBuilder();

        //создание пустого массива-списка
        ElasticArray<Character> elArr = new ElasticArray<>();
        for (int i = 0; i < str.length(); i++)
            elArr.add(str.charAt(i));   //заполнение массива-списка

        //вывод строки
        System.out.println("Вывод строки-источника\n" + str);

        //обратный итератор
        ElasticIterator<Character> revIter = elArr.getRevIter();
        while(revIter.hasNext()) sb.append(revIter.next()); //создание отзеркаленной строки
        System.out.println("\nВывод перевернутой строки\n" + sb + "\n");   //вывод этой строки
        sb.delete(0, sb.length());  //очищение строкопостроителя

        //добавление элемента в указанное место
        elArr.add(7,'U');

        //вызов итератора
        ElasticIterator<Character> iter = elArr.getIter();
        System.out.println("Вывод измененной строки с помощью итератора");
        while(iter.hasNext()) System.out.print(iter.next());
        System.out.println();   //отступ

        //новый объект итератора
        //удаление с помощью итератора
        //указанного символа
        iter = elArr.getIter();
        while(iter.hasNext()){
            char c = iter.next();
            if(c == 'а')
                iter.remove();
        }

       //новый итератор для строкостроителя
        iter = elArr.getIter();
        while (iter.hasNext())
            sb.append(iter.next());
        System.out.println("\nВывод строки после удаления символов\n" + sb);

        //получение ссылки на внешний класс
        ElasticArray<Character> list2 = iter.getElastic();
        System.out.println("\nВывод содержимого объекта ElasticArray:\n" + list2);
    }
}

