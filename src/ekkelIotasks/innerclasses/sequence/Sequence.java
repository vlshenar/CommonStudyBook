package ekkelIotasks.innerclasses.sequence;

/**
 * Задача из книги Брюса Эккеля по теме внутренние классы:
 * создайте класс, который содержит String и метод toString()
 * для вывода хранимой строки, добавьте несколько экземпляров
 * нового класса в объект Sequence и выведите их.
 */

public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int itemsSize) {
        items = new Object[itemsSize];
    }

    public void add(Object item) {
        if (next < items.length)
            items[next++] = item;
    }

    //внутренний класс, имплементирующий интерфейс Selector
    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}
