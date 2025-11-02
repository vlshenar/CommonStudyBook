package collectiontask.arraylisttest;

import java.util.ArrayList;

/**
 * Напишите Java-программу для печати всех элементов ArrayList, используя расположение элементов.
 */

public class ArraylistToPrint {
    //распечатывыет список в консоль
    private static void printArrayList(ArrayList<?> list) {
        for(Object o: list) System.out.print(o + "; ");
    }

    public static void main(String[] args) {

        WorkShopHolder holder = new WorkShopHolder();

        ArrayList<Employee> employeeList = holder.getWorkshop();

        printArrayList(employeeList);
    }
}
