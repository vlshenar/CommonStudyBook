package ekkelIotasks.innerclasses.sequence;

/**
 * Задача из книги Брюса Эккеля по теме внутренние классы:
 * создайте класс, который содержит String и метод toString()
 * для вывода хранимой строки, добавьте несколько экземпляров
 * нового класса в объект Sequence и выведите их.
 */

public interface Selector {
    boolean end();
    Object current();
    void next();
}
