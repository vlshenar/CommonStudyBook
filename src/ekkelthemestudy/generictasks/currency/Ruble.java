package ekkelthemestudy.generictasks.currency;

//Валюта: российский рубль
public final class Ruble implements Comparable<Ruble>{
    private final long value;

    //конструкторы
    public Ruble(long ruble, int penny) throws IllegalArgumentException{
        if (penny > 100) throw new IllegalArgumentException(
                "pennies should be less than 100"
        );
        value = ruble* 100L + penny;
    }

    public Ruble (double val)  {
        if (Double.compare(val, 0.0F) < 0)
            this.value = (long)(val*1000 - 1.0)/10;
        else
             this.value = (long)(val*1000.0 + 1.0)/10;
    }

    public Ruble (String score) throws IllegalArgumentException {
        if(score.contains("₽")) score = score.replace('₽', ' ');
        String[] values = score.trim().split("\\.");
        if (values[1].length() == 1) values[1] += "0";
        else if (values[1].length() > 2) throw new IllegalArgumentException(
                "pennies should be less than 100"
        );
        value = Long.parseLong(values[0]+values[1]);
    }

    //операции
    //сумма
    public static Ruble sum(Ruble r1, Ruble r2) {
        long sum = r1.value + r2.value;
        return new Ruble(sum/100, (int)(sum%100));
    }

    //вычитание
    public static Ruble substruct(Ruble r1, Ruble r2) {
        long difference = r1.value - r2.value;
        return new Ruble(difference/100, (int)(difference%100));
    }

    public Money getMoney() {
        return new RubMoney();
    }

    private class RubMoney extends Money {
        @Override
        public long getValue() {
            return Ruble.this.value;
        }
    }

    public String toString() {
        String valSentence = Long.toString(value);
        int len = valSentence.length();
        return  value / 100 + "." + valSentence.substring(len-2, len) + "₽";
    }

    @Override
    public int compareTo(Ruble ruble) {
        return Long.compare(this.value, ruble.value);
    }
}
