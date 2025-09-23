package ekkelIotasks.innerclasses;

import ekkelIotasks.innerclasses.sequence.Selector;
import ekkelIotasks.innerclasses.sequence.Sequence;

/**
 * Задача из книги Брюса Эккеля по теме внутренние классы:
 * создайте класс, который содержит String и метод toString()
 * для вывода хранимой строки, добавьте несколько экземпляров
 * нового класса в объект Sequence и выведите их.
 */

public class SequenceTest {
    private static String itemNames = "lid pencil desk phone car light notebook box";

    public static void main(String[] args) {

        //создание массива наименования предметов
        String[] things = itemNames.split("\\s");


        Sequence sequence = new Sequence(things.length);

        for (String t : things) sequence.add(new Item(t));

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

//класс, реализующий метод toString(),
//который добавляется в Sequence
class Item {
    private final String title;

    public Item(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}
