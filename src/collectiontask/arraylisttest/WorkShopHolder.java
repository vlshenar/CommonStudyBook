package collectiontask.arraylisttest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    //
    public ArrayList<Employee> getExtendWorkshop() {
        ArrayList<Employee> list = new ArrayList<>(workshop);
        try(BufferedReader reader = new BufferedReader(
                new FileReader("src/resources/employees.txt"))) {
            String s;
            while((s = reader.readLine()) != null)
                list.add(hireEmployee(s));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    //создает объект Employee по данным из строки
    private Employee hireEmployee(String emplData) {
        String[] employeeProperties = emplData.split(" ");
        return new Employee(employeeProperties[0], employeeProperties[1],
                Double.parseDouble(employeeProperties[2]));
    }
}

