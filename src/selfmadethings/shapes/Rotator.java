package selfmadethings.shapes;

import selfmadethings.NotNull;

import java.util.ArrayList;
import java.util.List;

class Rotator {
     static void rotate(@NotNull Shape shape){
        String shapeName = shape.getClass().getSimpleName();
        if (shapeName.equals("Circle")){
            Circle c = (Circle)shape;
            c.rotateCycles();
        }
        else System.out.println("It's not a circle.");
    }
    //помечает фигуру, соответствующую указаному типу
    static void markOf(@NotNull Shape item, String target){
         String itemName = item.getClass().getSimpleName();
         if(itemName.equals(target)) item.setMark();

    }
     public static void main(String[] args) {
         ShapeCreator creator = new ShapeCreator();
         List<Shape> shapeList = new ArrayList<>(creator.getShapeList(3));
         shapeList.add(new Circle(false));
         shapeList.add(new Rectangle());
         shapeList.add(new Square());
         shapeList.addAll(creator.getShapeList(2));
         String shapeType = "Ellipse";
         for (Shape s: shapeList){
             rotate(s);
             markOf(s, shapeType);
         }
         for (Shape s: shapeList) System.out.println(s);
     }
}
