package ekkelthemestudy.generictasks;

import collectiontask.arraylisttest.Employee;

/**
 * Задание из учебника Брюса Эккеля
 * создайте класс для хранения трех объектов одного
 * типа, с методами сохранения и выборки этих объектов
 * и конструктором для инициации всех трех объектов
 */

public class ThreeThingHolder {
    public static void main(String[] args) {
        Holder4<Employee> department = new Holder4<>(
                new Employee("Harry", "boss", 5000.0),
                new Employee("Bridget", "engineer", 3000.0),
                new Employee("Robert", "engineer", 3000.0)
        );

        for(int i = 0; i < 3; i++)
            System.out.println(department.get(i));

        System.out.println("Change employee number 2");
        department.set(1, new Employee("Jerry", "programmer", 4000.0));

        for(int i = 0; i < 3; i++)
            System.out.println(department.get(i));
    }

}

//класс для хранения трех объектов
class Holder4<T> {
   private Object[] things;

    //constructors
    Holder4() {
        this.things = new Object[3];
    }

    Holder4(T a, T b, T c) {
       this.things = new Object[3];
       things[0] = a;
       things[1] = b;
       things[2] = c;
    }

    //getter
    T get(int num) {
        return (T) things[num];
    }

    //setter
    void set(int num, T item) {
        things[num] = item;
    }
}
