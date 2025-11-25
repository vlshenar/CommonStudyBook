package collectiontask.arraylisttest;

import java.util.Objects;

/**
 * Напишите программу на Java для сортировки заданного списка массивов.
 */
//класс, объекты которого нужно сравнить
public class Employee implements Comparable<Employee> {
    //основные поля класса
    private final String name;
    private  String position;
    private  double salary;

    //конструктор
    public Employee(String n, String p, double sal) {
        name = n;
        position = p;
        salary = sal;
    }

    //геттер, необходимый для работы метода интерфейса
    public double getSalary() {
        return salary;
    }

    //остальные геттеры
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    //сеттеры
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //метод из интерфейса Comparable, необходимый для сортировки
    //сортировка будет по величине зарплаты
    @Override
    public int compareTo(Employee anotherEmployee) {
        return Double.compare(salary, anotherEmployee.getSalary());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if(otherObject == null)
            return false;
        if(getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee)otherObject;
        return Objects.equals(name, other.name) && Objects.equals(position, other.position)
                && salary == other.salary;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * 31 + Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(position);
        hash = hash * 31 + Double.hashCode(salary);
        return hash;
    }

    //вывод всей информации о работнике
    public String toString() {
        return name + "_" + position + "_" + salary;
    }
}
