package collectiontask.hashsettask;

import collectiontask.arraylisttest.Employee;
import collectiontask.arraylisttest.WorkShopHolder;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 11. Напишите Java-программу для сравнения двух наборов и сохранения элементов,
 * которые одинаковы для обоих наборов.
 */

public class HashSetTest4 {
    public static void main(String[] args) {
        WorkShopHolder holder = new WorkShopHolder();
        HashSet<Employee> set1 = new HashSet<>(holder.getWorkshop());
        set1.add(new Employee("Helga", "operator", 2400.0));
        HashSet<Employee> set2 = new HashSet<>(holder.getExtendWorkshop());

        System.out.println(set1 + "\n" + set2);

        compareAndRemove(set1, set2);

        System.out.println(set1 + "\n" + set2);
    }

    static void compareAndRemove(HashSet<Employee> set1, HashSet<Employee> set2) {
        Iterator<Employee> iter = set1.iterator();
        while(iter.hasNext()) {
            Employee e = iter.next();
            if(!set2.contains(e))
                iter.remove();
        }

        iter = set2.iterator();
        while(iter.hasNext()) {
            Employee e = iter.next();
            if(!set1.contains(e))
                iter.remove();
        }
    }
}
