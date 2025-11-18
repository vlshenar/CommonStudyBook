package selfmadethings.shapes;

import selfmadethings.NotNull;
import selfmadethings.fabricmetods.cyclesstuff.Cycle;

/**
 * Разбираю тему рефлексии
 * по книге Брюса Эккеля
 * Философия Java
 */

abstract class Shape {

    //выбирает данную фигуру
    protected void setMark() {
        this.mark = true;
    }

    //выбрана ли данная фигура?
    protected boolean isMark() {
        return mark;
    }

    protected abstract String getName();

    void draw() {
        System.out.println(this + ".draw()");
    }

    public abstract String toString();

    //флаг, что данная фигура выбрана
    private boolean mark = false;
}

class Circle extends Shape implements Cycle {
    //возможность вращать
    private final boolean rotatePossible;

    //конструктор по умолчанию
    Circle() {
        name = "Circle";
        this.rotatePossible = true;
    }

    Circle(boolean r) {
        name = "Circle";
        this.rotatePossible = r;
    }

    //getter
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "marked-" + isMark() + " " + name;
    }

    @NotNull
    private final String name;

    @Override
    public void rotateCycles() {
        if (rotatePossible)
            System.out.println("Spinning the circle!");
        else
            System.out.println("Doesn't even rotate a bit.");
    }
}

class Triangle extends Shape {
    static {
        System.out.println("I'm triangle!");
    }

    Triangle() {
        name = "Triangle";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "marked-" + isMark() + " " + name;
    }

    @NotNull
    private final String name;
}

class Square extends Shape {
    Square() {
        name = "Square";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "marked-" + isMark() + " " + name;
    }

    @NotNull
    private final String name;

}