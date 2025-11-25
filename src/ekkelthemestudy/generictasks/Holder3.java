package ekkelthemestudy.generictasks;

/**
 * Задание из учебника Брюса Эккеля
 * используйте Holder3 с библиотекой typeinfo.pets и продемонстрируйте,
 * что объект Holder3, объявленный с базовым типом, также может хранить и
 * производный тип
 */

 class Holder3<T> {
    private T a;

    //constructor
    public Holder3(T a) {
        this.a = a;
    }

    //setter
    public void set(T a) {
        this.a = a;
    }

    //getter
    public T get() {
        return a;
    }
}
