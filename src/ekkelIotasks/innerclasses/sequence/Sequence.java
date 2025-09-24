package ekkelIotasks.innerclasses.sequence;

/**
 * Задачи из книги Брюса Эккеля по теме внутренние классы:
 * 1) создайте класс, который содержит String и метод toString()
 * для вывода хранимой строки, добавьте несколько экземпляров
 * нового класса в объект Sequence и выведите их.
 * 2) Реализуйте reverseSelector в классе Sequence
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

    //обратный селектор (задание 2)
    private class ReverseSequenceSelector implements Selector{

        int i = items.length;

        @Override
        public boolean end() {
            return i == 0;
        }

        @Override
        public Object current() {
            return items[i-1];
        }

        @Override
        public void next() {
            //перебирает массив в обратном порядке
            if(i > 0) i--;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector(){
        return new ReverseSequenceSelector();
    }
}
