package collectiontask.arraylisttest;

/**
 * Напишите программу на Java для сортировки заданного списка массивов.
 */
//класс, объекты которого нужно сравнить
public class Employee implements Comparable<Object> {
    //основные поля класса
    private final String name;
    private final String position;
    private final double salary;

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

    //метод из интерфейса Comparable, необходимый для сортировки
    //сортировка будет по величине зарплаты
    @Override
    public int compareTo(Object o) {
        Employee anotherWorker = (Employee) o;
        return Double.compare(salary, anotherWorker.getSalary());
    }

    //вывод всей информации о работнике
    public String toString() {
        return name + "_" + position + "_" + salary;
    }
}
