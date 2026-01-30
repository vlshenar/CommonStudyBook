package ekkelthemestudy.generictasks.currency;

public final class Dollar implements Comparable<Dollar> {
    private final long value;

    //constructors
    public Dollar(long dollars, int cents) throws IllegalArgumentException {
        if (cents > 100) throw new IllegalArgumentException(
                "cents should be less then 100."
        );
        value = dollars*100L + cents;
    }

    public Dollar(double dollars) {
        if(Double.compare(dollars, 0.0F) < 0)
            value = (long)(dollars*1000.0 - 1.0)/10;
        else
            value = (long)(dollars*1000.0 + 1.0)/10;
    }

    public Dollar(String dollars) {
        if(dollars.contains("$")) dollars = dollars.replace("$", "");
        String[] values = dollars.trim().split("\\.");
        if (values[1].length() == 1) values[1] += "0";
        else if (values[1].length() > 2) throw new IllegalArgumentException(
                "pennies should be less than 100"
        );
        value = Long.parseLong(values[0]+values[1]);
    }

    //operations
    //summa
    public static Dollar sum(Dollar d1, Dollar d2) {
        long result = d1.value + d2.value;
        return new Dollar(result/100, (int)result%100);
    }

    //substruction
    public static Dollar substruct (Dollar d1, Dollar d2) {
        long result = d1.value - d2.value;
        return new Dollar(result/100, (int)result%100);
    }

    public Money getMoney() {
        return new DolMoney();
    }

    private class DolMoney extends Money {
        @Override
        public long getValue() {
            return Dollar.this.value;
        }
    }

    @Override
    public int compareTo(Dollar dollar) {
        return Long.compare(this.value, dollar.value);
    }

    public String toString() {
        String valSentence = Long.toString(value);
        int len = valSentence.length();
        return "$" + value/100 + "." + valSentence.substring(len-2, len);
    }
}
