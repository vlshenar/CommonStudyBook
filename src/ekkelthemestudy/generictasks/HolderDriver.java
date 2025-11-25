package ekkelthemestudy.generictasks;

import collectiontask.arraylisttest.Cats;
import collectiontask.arraylisttest.Dogs;
import collectiontask.arraylisttest.Pets;

/**
 * Задание из учебника Брюса Эккеля
 * используйте Holder3 с библиотекой typeinfo.pets и продемонстрируйте,
 * что объект Holder3, объявленный с базовым типом, также может хранить и
 * производный тип
 */

public class HolderDriver {
    /*
     * так как библиотеки typeinfo.pets у меня нет,
     * воспользуюсь классами Pets, Cats и Dogs из пакета
     * collectiontask.arraylisttest, Pets - абстрактный класс
     */
    public static void main(String[] args) {
        Holder3<Pets> holder = new Holder3<>(new Cats("Barsik", "meaou!"));
        String className = holder.get().getClass().getName();
        String superClassName = holder.get().getClass().getSuperclass().getName();
        System.out.println("holder contains object: " + className);
        System.out.println("super class: " + superClassName);

        //заменим хранимый объект
        holder.set(new Dogs("Hutch"));
        className = holder.get().getClass().getName();
        superClassName = holder.get().getClass().getSuperclass().getName();
        System.out.println("now holder contains object: " + className);
        System.out.println("super class: " + superClassName);
    }
}
