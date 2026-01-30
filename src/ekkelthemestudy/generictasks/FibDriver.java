package ekkelthemestudy.generictasks;

import java.util.Iterator;

public class FibDriver {
    public static void main(String[] args) {
        Fibanachi fiba = new Fibanachi();
        for (int i = 0; i < 6; i++) {
            System.out.print(fiba.next() + " ");
        }
        System.out.println();

        //foreach + Iterable
        for(Integer i: new FibIteration(15))
            System.out.print(i + " ");
        System.out.println();

        //Iterator явный вызов
        Iterator<Integer> iter = new FibIteration(15).iterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");
    }
}
