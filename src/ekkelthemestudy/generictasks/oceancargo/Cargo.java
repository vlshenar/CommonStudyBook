package ekkelthemestudy.generictasks.oceancargo;

import ekkelthemestudy.generictasks.store.Product;

import java.util.ArrayList;

/**
 * по образцу Store.java постройте модель грузового судна-контейнеровоза
 * задача из Брюс Эккель Философия Java
 */

public class Cargo extends ArrayList<Container> {
    public Cargo(int containers, int nProd) {
        for (int i = 0; i < containers; i++)
            add(new Container(nProd));
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Container c: this)
            for (Product p: c) {
                result.append(p);
                result.append("\n");
            }
        return result.toString();
    }
}
