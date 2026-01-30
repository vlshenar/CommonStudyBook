package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.currency.CurrencyConvert;
import ekkelthemestudy.generictasks.currency.Dollar;
import ekkelthemestudy.generictasks.currency.Ruble;

//обмен валют, реализация обобщенных интерфейсов
public class Banko implements CurrencyConvert<Dollar, Ruble> {
    private final double course;

    //constructor
    public Banko(double convertCourse) {
        course = convertCourse;
    }

    @Override
    public Dollar convert(Ruble coin) {
        double moneys = (double)coin.getMoney().getValue() / 100.0;
        double count = moneys / course;
        return new Dollar(count);
    }

    @Override
    public Ruble backConvert(Dollar coin) {
        double moneys = (double)coin.getMoney().getValue() / 100.0;
        double count = course * moneys;
        return new Ruble(count);
    }

    public static void main(String[] args) {
        //курс доллара 76.01 рубль за доллар
        Banko banko = new Banko(76.01);
        Ruble ruble = new Ruble("3400.40");
        Dollar dollar = banko.convert(ruble);
        System.out.println("Ruble --> dollar\n" + ruble + " --> " + dollar);
        dollar = new Dollar("3.00");
        ruble = banko.backConvert(dollar);
        System.out.println("Dollar --> ruble\n" + dollar + " --> " + ruble);
    }
}
