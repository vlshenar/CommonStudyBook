package collectiontask.arraylisttest;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedInsert<T extends Comparable<T>> {
    private final ArrayList<T> sortedList;

    public SortedInsert() {
        this.sortedList = new ArrayList<>();
    }

    public SortedInsert(int capacity) {
        this.sortedList = new ArrayList<>(capacity);
    }

    public ArrayList<T> getSortedList() {
        return sortedList;
    }

    //вносит новый элемент в список, попутно сортируя его
    public void setItem(T item) {
        if (sortedList.isEmpty()) sortedList.add(item);
        else if (item.compareTo(sortedList.get(0)) < 0) sortedList.add(0, item);
        else if (item.compareTo(sortedList.get(sortedList.size() - 1)) >= 0)
            sortedList.add(item);
        else findPlace(item, 0, sortedList.size() - 1);
    }

    public void setItem(T item, Comparator<T> comparator) {
        if (sortedList.isEmpty()) sortedList.add(item);
        else if (comparator.compare(item, sortedList.get(0)) < 0)
            sortedList.add(0, item);
        else if (comparator.compare(item, sortedList.get(sortedList.size() - 1)) >= 0)
            sortedList.add(item);
        else findPlace(item, comparator, 0, sortedList.size() - 1);
    }

    //ищет место в ряду элементов методом бинарного поиска
    private void findPlace(T item, int left, int right) {
        int mid = left + (right - left) / 2;
        if (item.compareTo(sortedList.get(mid)) >= 0 &&
                item.compareTo(sortedList.get(mid + 1)) < 0)
            sortedList.add(mid + 1, item);
        else if (item.compareTo(sortedList.get(mid)) < 0)
            findPlace(item, left, mid);
        else findPlace(item, mid, right);
    }

    private void findPlace(T item, Comparator<T> comparator, int left, int right) {
        int mid = left + (right - left) / 2;
        if (comparator.compare(item, sortedList.get(mid)) >= 0 &&
                comparator.compare(item, sortedList.get(mid + 1)) < 0)
            sortedList.add(mid + 1, item);
        else if (comparator.compare(item, sortedList.get(mid)) < 0)
            findPlace(item, comparator, left, mid);
        else findPlace(item, comparator, mid, right);
    }
}
