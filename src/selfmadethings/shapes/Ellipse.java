package selfmadethings.shapes;

import selfmadethings.NotNull;

class Ellipse extends Circle {
    Ellipse() {
        name = "Ellipse";
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
