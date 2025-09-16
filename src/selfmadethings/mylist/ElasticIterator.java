package selfmadethings.mylist;

import java.util.Iterator;

/**
 * Учебная реализация массива-списка, аналога
 * стандартного ArrayList
 */

public interface ElasticIterator<E> extends Iterator<E> {

    //Возвращает список, по которому
    //движется данный итератор
    ElasticArray<E> getElastic();
}
