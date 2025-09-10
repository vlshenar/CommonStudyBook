package collectiontask.arraylisttest;


import java.util.Collections;
import java.util.Comparator;


/**
 * Напишите программу на Java для сортировки заданного списка массивов.
 */

public class ArrListSort {
    public static void main(String[] args) {

        //сортировка методом из класса Collections
        //объект класса, содержащего массив-список
       WorkShopHolder wshp = new WorkShopHolder();
        System.out.println(wshp.getWorkshop());
        System.out.println("Сортировка методом Collections.sort()");
        try{
            Collections.sort(wshp.getWorkshop());
        }catch (NullPointerException e){
            e.getStackTrace();
        }
        System.out.println(wshp.getWorkshop());

        //сортировка методом из класса ArrayList
        //новый объект с неотсортированным массивом
        wshp = new WorkShopHolder();
        System.out.println("\n" + wshp.getWorkshop());
        System.out.println("Сортировка методом ArrayList");
        wshp.getWorkshop().sort(new EmplComparator());  //с использованием компаратора
        System.out.println(wshp.getWorkshop());

        //сортировка в порядке убывания
        System.out.println("\n Сортировка в порядке убывания");
        wshp = new WorkShopHolder();
        wshp.getWorkshop().sort(Comparator.reverseOrder());
        System.out.println(wshp.getWorkshop());
    }
}
