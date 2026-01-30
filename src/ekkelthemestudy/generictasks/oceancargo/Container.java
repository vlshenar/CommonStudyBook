package ekkelthemestudy.generictasks.oceancargo;

import ekkelthemestudy.generictasks.generator.Generators;
import ekkelthemestudy.generictasks.store.Product;

import java.util.ArrayList;

/**
 * по образцу Store.java постройте модель грузового судна-контейнеровоза
 * задача из Брюс Эккель Философия Java
 */

public class Container extends ArrayList<Product> {
    public Container(int nProd) {
            Generators.fill(this, Product.generator, nProd);
    }
}
