package collectiontask.arraylisttest;

import java.util.ArrayList;

/**
 * Напишите программу на Java для сортировки заданного списка массивов.
 */

//создает и возвращает неотсортированный список-массив объектов Employee
public class WorkShopHolder {
    ArrayList<Employee> workshop;

    //конструктор
    public WorkShopHolder() {
        //создание пустого списка
        workshop = new ArrayList<>();

        //добавление элементов в список
        workshop.add(new Employee("John", "mechanic", 2500.35));
        workshop.add(new Employee("Sam", "turner", 2600.75));
        workshop.add(new Employee("Garry", "mechanic", 2450.00));
        workshop.add(new Employee("Robert", "overman", 3100.00));
        workshop.add(new Employee("Piter", "mechanic", 1800.90));
        workshop.add(new Employee("Antony", "turner", 2700.00));
    }

    //возвращает массив-список объектов Employee неотсортированный
    public ArrayList<Employee> getWorkshop() {
        return workshop;
    }
}

