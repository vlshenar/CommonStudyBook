package selfmadethings.shapes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Использование механизма рефлексии для создания
 * экземпляра класса
 */

public class Drawer {
    public static void main(String[] args) throws Exception {

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Square());
        shapeList.add(new Triangle());

        for (Shape shape : shapeList) shape.draw();

        System.out.println("Working with .class");

        Class<?> cl = null;

        try {
            cl = Class.forName("selfmadethings.shapes.Circle");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
            System.exit(1);
        }

        // Class<?> up = cl.getSuperclass(); нить наследования
        Object obj = null;

        try {
            obj = cl.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException e) {
            System.err.println("Creation example failed!");
            System.exit(1);
        }

        Shape dynShape = (Circle) obj;
        dynShape.draw();

        Constructor<?>[] cons = cl.getDeclaredConstructors();
        System.out.println(Arrays.asList(cons));
    }
}
