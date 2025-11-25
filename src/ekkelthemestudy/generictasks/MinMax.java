package ekkelthemestudy.generictasks;

/**
 * Написать обобщенный класс MinMax, который содержит методы для
 * нахождения минимального и максимального элемента массива.
 * Массив является переменной класса.
 * Массив должен передаваться в класс через конструктор.
 */

public class MinMax<T extends Comparable<T>> {
    Object[] arr;

    //constructor
    public MinMax(T[] arr) {
        this.arr = arr;
    }

    //item with minimal value
    public T getMin() {
        T min = (T) arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo((T) arr[i]) > 0)
                min = (T) arr[i];
        }
        return min;
    }

    //item with maximal value
    public T getMax() {
        T max = (T) arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo((T) arr[i]) < 0)
                max = (T) arr[i];
        }
        return max;
    }
}
