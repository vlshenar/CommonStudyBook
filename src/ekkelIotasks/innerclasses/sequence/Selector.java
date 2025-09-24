package ekkelIotasks.innerclasses.sequence;

/**
 * Задачи из книги Брюса Эккеля по теме внутренние классы:
 * 1) создайте класс, который содержит String и метод toString()
 * для вывода хранимой строки, добавьте несколько экземпляров
 * нового класса в объект Sequence и выведите их.
 * 2) Реализуйте reverseSelector в классе Sequence
 */

public interface Selector {
    boolean end();
    Object current();
    void next();
}
