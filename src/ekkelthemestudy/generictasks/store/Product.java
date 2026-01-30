package ekkelthemestudy.generictasks.store;

import ekkelthemestudy.generictasks.currency.Ruble;
import ekkelthemestudy.generictasks.generator.Generator;

import java.util.Random;

public class Product {
    private final int id;
    private String description;
    private Ruble price;

    public Product(int id, Ruble price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public Product(int id, double price, String description) {
        this.id = id;
        this.price = new Ruble(price);
        this.description = description;
    }

    public Product(int id, String price, String description) {
        this.id = id;
        this.price = new Ruble(price);
        this.description = description;
    }

    //price change
    public void priceChange(Ruble change) {
        price = Ruble.sum(price, change);
    }

    public void priceChange(double change) {
        price = Ruble.sum(price, new Ruble(change));
    }

    public void priceChange(String change) {
        price = Ruble.sum(price, new Ruble(change));
    }

    public String toString() {
        return id + ": " + description + " price: " + price;
    }

    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random rand = new Random(47);
                @Override
                public Product next() {
                    return new Product(rand.nextInt(100),
                            Math.round(rand.nextDouble()*1000.0)+0.99, "Test");
                }
            };
}
