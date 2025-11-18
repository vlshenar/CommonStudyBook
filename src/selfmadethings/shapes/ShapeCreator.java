package selfmadethings.shapes;

import selfmadethings.Myannotation;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Класс, содержащий метод, который возвращает лист
 * случаных объектов фигур
 */

class ShapeCreator {
    //возвращает массив-список  классов фигур
    private static ArrayList<Class<? extends Shape>> getTypes() {
        ArrayList<Class<? extends Shape>> shapoidList = new ArrayList<>();
        String[] shpNames = {
                "selfmadethings.shapes.Circle",
                "selfmadethings.shapes.Triangle",
                "selfmadethings.shapes.Square",
                "selfmadethings.shapes.Ellipse",
                "selfmadethings.shapes.Rectangle",
                "selfmadethings.shapes.Romboid"
        };

        for (String name : shpNames) {
            try {
                shapoidList.add((Class<? extends Shape>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return shapoidList;
    }

    //метод, возвращающий один случайный объект типа фигура
    private Shape randomShape() {
        Shape result;
        int n = rand.nextInt(temporaryList.size());
        try {
            result = temporaryList.get(n).getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    //получить свой лист фигур
    List<Shape> getShapeList(int shapes) {
        Shape[] arrShape = new Shape[shapes];
        for (int i = 0; i < shapes; i++)
            arrShape[i] = randomShape();
        return Arrays.asList(arrShape);
    }

    //рабочая ссылка на список классов для работы с рандомным наименователем
    private ArrayList<Class<? extends Shape>> temporaryList;

    //генератор случайных чисел
    private Random rand;

    //конструктор
    ShapeCreator() {
        temporaryList = getTypes();
        rand = new Random(47);
    }
}

/**
 * класс, создающий хэш-таблицу вида фигура - количество в наборе
 */
@Myannotation("расширяет класс HashMap<>()")
class ShapeCounter extends HashMap<String, Integer> {

    void count(String type) {
        Integer quantity = get(type);
        if (quantity == null)
            put(type, 1);
        else put(type, quantity + 1);
    }

    void showCounts(String type) {
        System.out.println(type + " = " + get(type));
    }
}
