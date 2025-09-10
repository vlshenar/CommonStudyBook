package selfmadethings.myhashtable;

/**
 * учебная реализация хэш-таблицы
 */
public class MyHashMap {

    private final int M = 997;  //максимальное число позиций в таблице
    private Item[] items;

    private class Item {
        private Object value;
        private Object key;

        //конструктор
        private Item(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        private Object getValue() {
            return value;
        }

        private String getItemAsString() {
            return key.toString() + " - " + value.toString();
        }
    }

    //конструктор
    public MyHashMap() {
        items = new Item[M];
        for (int i = 0; i < M; i++)
            items[i] = null;
    }

    //ввести пару ключ-значение
    public void put(Object key, Object value) {
        Item item = new Item(key, value);
        int place = getPlace(key.hashCode());
        items[place] = item;
    }

    //получить значение по ключу
    public Object get(Object key) {
        int place = getPlace(key.hashCode());
        if(items[place] == null)
            return null;
        else
            return items[place].getValue();
    }

    //удалить значение по ключу
    public void remove(Object key) {
        int place = getPlace(key.hashCode());
        items[place] = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < M) {
            if (items[i] != null)
                sb.append(items[i].getItemAsString()).append("\n");
            i++;
        }
        return sb.toString();
    }

    /*
     * служебный метод для вычисления места в массиве.
     * В книге Роберта Седжвика "Алгоритмы на Java" приводится
     * маска вида 0x7fffffff убирающая знаковый бит и
     * оставляющая от начального хэш-кода 31-битное число
     */
    private int getPlace(long keyHash) {
        /*
        * использование в качестве маски литерала
        * типа long позволяет задействовать выпадающий
        * 32-й бит, оставшись в области положительных
        * чисел и уменьшить вероятность коллизии, обусловленной
        * скрадыванием этого бита
        */
        return (int)((keyHash & 0xffffffffL) % M);
    }
}
