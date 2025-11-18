package selfmadethings.shapes;

import selfmadethings.NotNull;

class Rectangle extends Shape{
     Rectangle(){
         name = "Rectangle";
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
//класс для загрузки
class Romboid extends Shape{
     static{
         System.out.println("Ну я ромб, и я типо существую.");
     }
    //constructor

    public Romboid() {
         this.name = "Romboid";
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Marked-" + isMark() + " " + name;
    }
    @NotNull
    private final String name;
}