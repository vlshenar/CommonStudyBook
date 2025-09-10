package collectiontask.arraylisttest;

/**
 * удаление элемента массива путем копирования
 * его элементов в массив мощностью на 1 меньше
 * чем исходный массив методом arraycopy класса System
 */

public class FastRemoveAr {
    public static void main(String[] args) {

        //число элементов в массиве
        int capacity = 5;

        //массив, из которого удаляют элемент
        //создание массива
        int[] beforeRemoveAr = new int[capacity];

        //инициализация
        for (int i = 0; i < capacity; i++)
            beforeRemoveAr[i] = i + 1;

        //массив, где элемент удален
        int[] afterRemoveAr = new int[beforeRemoveAr.length - 1];

        //вывод исходного массива
        System.out.println("Массив до удаления элемента");
        for (int i : beforeRemoveAr) System.out.print(i + " ");

        //удаление первого элемента
        System.arraycopy(beforeRemoveAr, 1, afterRemoveAr, 0, afterRemoveAr.length);
        System.out.println("\nУдаление первого элемента");
        for (int i : afterRemoveAr) System.out.print(i + " ");

        //удаление последнего элемента
        System.arraycopy(beforeRemoveAr, 0, afterRemoveAr, 0, afterRemoveAr.length);
        System.out.println("\nУдаление последнего элемента");
        for (int i : afterRemoveAr) System.out.print(i + " ");


        //удаление элемента из середины массива
        int n = 2;  //номер удаляемого элемента
        System.arraycopy(beforeRemoveAr, 0, afterRemoveAr, 0, n);
        System.arraycopy(beforeRemoveAr, n + 1, afterRemoveAr, n, afterRemoveAr.length - n);
        System.out.println("\nУдаление элемента номер " + (n + 1));
        for (int i : afterRemoveAr) System.out.print(i + " ");
    }
}
