package ekkelthemestudy.generictasks.currency;

public interface CurrencyConvert<A, B> {
    A convert(B coin);
    B backConvert(A coin);
}
