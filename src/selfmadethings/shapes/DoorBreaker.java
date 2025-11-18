package selfmadethings.shapes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * использование рефлексии для вызова метода,
 * который объявлен как private,
 * а также получение доступа к приватным полям
 */

public class DoorBreaker {
    public static void main(String[] args) throws Exception {

        ShapeCreator creator = new ShapeCreator();

        Ellipse el = new Ellipse();
        Ellipse el2 = new Ellipse();

        System.out.println(el + "\n" + el2);
        Class<?> crClazz = creator.getClass();
        Field[] fld = Ellipse.class.getDeclaredFields();

        for (Field field : fld) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(el, "Oval");
                field.set(el2, "BadLookingWheel");
            }

            System.out.println(field.getName());
        }

        System.out.println(el + "\n" + el2);

        //получение доступа к приватному методу
        Method[] methods = crClazz.getDeclaredMethods();

        for (Method m : methods) {
            if (m.getName().equals("randomShape")) {
                m.setAccessible(true);
                Shape criptoShape = (Shape) m.invoke(creator);
                System.out.println(criptoShape);
            }
        }

        for (Method method : methods) System.out.println(method.toString());
    }
}
