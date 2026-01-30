package ekkelthemestudy.generictasks.store;

import ekkelthemestudy.generictasks.generator.Generators;

import java.util.ArrayList;

public class Shelf extends ArrayList<Product> {
    public Shelf(int nProduct) {
        Generators.fill(this, Product.generator, nProduct);
    }
}
