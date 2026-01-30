package ekkelthemestudy.generictasks.store;

import java.util.ArrayList;

public class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProduct) {
        for (int i = 0; i < nShelves; i++)
            add(new Shelf(nProduct));
    }
}

class CheckoutStand {
}

class Office {
}
