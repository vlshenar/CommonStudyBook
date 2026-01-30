package ekkelthemestudy;

import ekkelthemestudy.generictasks.store.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product(34, "57.45", "bread");
        System.out.println(product1);
        product1.priceChange(-2.55);
        System.out.println(product1);
    }
}
