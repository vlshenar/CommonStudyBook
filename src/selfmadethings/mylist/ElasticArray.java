package selfmadethings.mylist;

import java.util.Arrays;

/**
 * Учебная реализация массива-списка, аналога
 * стандартного ArrayList
 */

public class ElasticArray<T> {

    private final int defaultSize = 5;
    private int itemNum = 0;
    private Object[] container;

    public ElasticArray() {
        container = new Object[defaultSize];
        Arrays.fill(container, null);
    }

    //добавление элемента
    public void add(Object o) {
        if (itemNum < container.length) {
            container[itemNum] = o;
            itemNum++;
        } else {
            extraSlots();
            add(o);
        }
    }

    //добавление элемента в указанное место
    //возбуждает исключение выхода за пределы массива
    public void add(int element, Object o)
            throws ArrayIndexOutOfBoundsException {
        if (element >= container.length)
            throw new ArrayIndexOutOfBoundsException();
        if (itemNum < container.length) {
            for (int i = container.length - 1; i > element; i--)
                container[i] = container[i - 1];
            container[element] = o;
            itemNum++;
        } else {
            extraSlots();
            add(element, o);
        }
    }

    //удаление всех элементов
    public void deleteAll() {
        Arrays.fill(container, null);
        container = new Object[defaultSize];
        itemNum = 0;
    }

    //удаление элемента на выбранной позиции
    public void delete(int element)
            throws ArrayIndexOutOfBoundsException {
        if (element > itemNum)
            throw new ArrayIndexOutOfBoundsException();
        if (container.length == defaultSize) {
            for (int i = element; i < itemNum - 1; i++)
                container[i] = container[i + 1];
        } else {
            fastRemove(element);
        }
        itemNum--;
    }

    //служебный метод добавления ячейки к массиву
    private void extraSlots() {
        int largeNum = container.length + 1;
        Object[] tmp = new Object[largeNum];
        System.arraycopy(container, 0, tmp, 0, container.length);
        container = tmp;
    }

    //служебный метод быстрого удаления
    private void fastRemove(int element) {
        Object[] tmp = new Object[container.length - 1];
        if (element == 0)
            System.arraycopy(container, 1, tmp, 0, tmp.length);
        else if (element == container.length - 1)
            System.arraycopy(container, 0, tmp, 0, tmp.length);
        else {
            System.arraycopy(container, 0, tmp, 0, element);
            System.arraycopy(container, (element + 1), tmp, element, tmp.length - element);
        }
        container = tmp;
    }

    //класс итератор
    public class IterThisArr implements ElasticIterator<T> {
        private int iterPoint;

        private IterThisArr() {
            iterPoint = 0;
        }

        @Override
        public boolean hasNext() {
            return iterPoint < itemNum;
        }

        @Override
        public T next() {
            if (iterPoint < itemNum) {
                Object o = container[iterPoint];
                iterPoint++;
                return (T) o;
            } else
                return null;
        }

        @Override
        public void remove() {
            delete(iterPoint - 1);
        }

        //метод для получения ссылки на внешний класс
        public ElasticArray<T> getElastic() {
            return ElasticArray.this;
        }
    }

    //обратный итератор
    public class ReverseIterator implements ElasticIterator<T> {
        private int iterPoint;

        private ReverseIterator() {
            iterPoint = itemNum - 1;
        }

        @Override
        public ElasticArray<T> getElastic() {
            return ElasticArray.this;
        }

        @Override
        public boolean hasNext() {
            return iterPoint > 0;
        }

        @Override
        public T next() {
            if (iterPoint > 0) {
                Object o = container[iterPoint];
                iterPoint--;
                return (T) o;
            } else
                return null;
        }

        @Override
        public void remove() {
            delete(iterPoint + 1);
        }
    }

    //методы, вызывающие итераторы
    //прямой перебор
    public IterThisArr getIter() {
        return new IterThisArr();
    }

    //обратный перебор
    public ReverseIterator getRevIter() {
        return new ReverseIterator();
    }

    //toString override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < itemNum; i++) {
            sb.append(container[i]);
            if (i != itemNum - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
