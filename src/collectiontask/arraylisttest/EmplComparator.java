package collectiontask.arraylisttest;

import java.util.Comparator;

/**
 * Напишите программу на Java для сортировки заданного списка массивов.
 */

//Содержит метод сравнения двух объектов класса Employee
public class EmplComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

        return emp1.compareTo(emp2);
    }
}
