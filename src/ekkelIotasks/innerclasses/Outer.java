package ekkelIotasks.innerclasses;

/**
 * Задание из учебника Брюса Эккеля "Философия Java"
 * напишите класс с именем Outer, содержащий класс с
 * именем Inner. Добавьте метод в Outer, возвращающий
 * объект типа Inner. В методе main() создайте и инициализируйте
 * ссылку на Inner
 */

public class Outer {
    private final String message = "Closed from outside.";

    //внутренний класс
     class Inner{
        private String title;

        //конструктор
        Inner(String t){
            title = t;
        }

        //переопределение метода
        public String toString(){
            return "Outer.Inner - " + title
                    + "\nand secret message from Outer: " + message;
        }
    }

    //возвращает объект типа Inner
    public Inner getInner(String title){
        return new Inner(title);
    }

    public static void main(String[] args) {

        Outer.Inner inner = new Outer().getInner("Snowfall is beautyfull thing!");

        System.out.println(inner);
    }
}
