package ekkelthemestudy;

import ekkelthemestudy.generictasks.currency.Ruble;

public class MoneyTest3 {
    public static void main(String[] args) {
        Ruble negateRub = Ruble.substruct(new Ruble(0, 0), new Ruble(2,20));
        System.out.println(negateRub);
        Ruble result = Ruble.sum(new Ruble(10, 30), negateRub);
        System.out.println(result);
        System.out.println(result.compareTo(new Ruble("8.30")));
    }
}
