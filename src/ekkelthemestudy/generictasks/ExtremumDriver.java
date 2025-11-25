package ekkelthemestudy.generictasks;

import collectiontask.arraylisttest.Employee;
import collectiontask.arraylisttest.WorkShopHolder;

/**
 * Написать обобщенный класс MinMax, который содержит методы для
 * нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 */

public class ExtremumDriver {
    public static void main(String[] args) {
        //проверка на числах
        Integer[] intArr = {5, 4, 5, 18, -7, -3, 2, 9, 6, 12, 0};
        MinMax<Integer> minMax = new MinMax<>(intArr);
        System.out.println(minMax.getMin());
        System.out.println(minMax.getMax());

        //проверка на классе Employee
        WorkShopHolder holder = new WorkShopHolder();
        MinMax<Employee> employeeMinMax = new MinMax<>(holder.getWorkshop().toArray(new Employee[0]));
        System.out.println("Employee with min salary: " + employeeMinMax.getMin());
        System.out.println("Employee with max salary: " + employeeMinMax.getMax());
    }
}
