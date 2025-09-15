package selfmadethings;

import selfmadethings.myhashtable.MyHashMap;

/**
 * Проверка работы учебной самописной
 * хэш-таблицы
 */

public class MyHashDriver {

    public static void main(String[] args) {
        //строка с повторяющимися символами
        String repeatedChars = "a;lksulas;diva;lksjdfiva;las;dfuw8jsssk2ok";

        //учебная самописная хэш-таблица
        MyHashMap myMap = new MyHashMap();

        for (int i = 0; i < repeatedChars.length(); i++) {
            char ch = repeatedChars.charAt(i);
            if (myMap.get(ch) != null) {
                Integer score = (Integer) myMap.get(ch);
                myMap.put(ch, score + 1);
            } else myMap.put(ch, 1);
        }

        //вывод числа повторений для каждого символа
        System.out.println(myMap);

        //новая таблица для второго теста
        myMap = new MyHashMap();

        //добавление
        myMap.put("tree", "Oak");
        myMap.put("liquid", "water");
        myMap.put("sentence", "Лето - мое любимое время года");

        //удаление элемента
        myMap.remove("tree");

        //вывод результата
        System.out.println(myMap);
    }
}
