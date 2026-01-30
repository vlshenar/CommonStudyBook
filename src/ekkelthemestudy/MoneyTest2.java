package ekkelthemestudy;

import ekkelthemestudy.generictasks.currency.Ruble;

public class MoneyTest2 {
    public static void main(String[] args) {
        Ruble r1 = new Ruble(25, 40);
        String s = r1.toString();
        Ruble r2 = new Ruble(s);
        System.out.println(r1 + " " + r2);
    }
}
