package selfmadethings.shapes;

import java.util.List;

/**
 * подсчет количества фигур в связном списке
 */

public class CountTest {
    public static void main(String[] args) {

        //создатель списка случайных объектов фигур
        ShapeCreator creator = new ShapeCreator();

        //подсчитывает количество фигур с заданым названием
        ShapeCounter counter = new ShapeCounter();

        //список фигур
        List<Shape> shapeList = creator.getShapeList(90);

        //подсчет одинаковых фигур в списке
        for (Shape s : shapeList) counter.count(s.getName());

        //вывод количества конкретных фигур в списке
        for (String name : shapeNames) counter.showCounts(name);
    }

    static String[] shapeNames = {
            "Circle",
            "Triangle",
            "Square",
            "Ellipse",
            "Rectangle",
            "Romboid"
    };
}
