package ekkelthemestudy;

import ekkelthemestudy.generictasks.currency.Ruble;

public class MoneyTest {
    public static void main(String[] args) {
        Ruble r1 = new Ruble(20, 50);
        Ruble r2 = new Ruble(30.2);
        Ruble r3 = new Ruble("40.6");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r1 + r3 = " + Ruble.sum(r1, r3));
        System.out.println("r2 - r3 = " + Ruble.substruct(r2, r3));
        Ruble coast = new Ruble("0.1");
        for(int i = 0; i < 3; i++) coast = Ruble.sum(coast, r1);
        System.out.println("final coast: " + coast);
        System.out.println("checking correctness of insert");
        try {
            Ruble incorrectCoin = new Ruble(34, 201);
        } catch (IllegalArgumentException e) {
            System.err.println("incorrect insert: " + e);
        }
    }
}
