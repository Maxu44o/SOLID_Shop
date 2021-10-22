package Cart;

import Product.Discountable;
import Product.Product;

import java.util.Map;

public class Discount {
    private Map<Product, Integer> discCart;
    private int totalDiscount;

    public Discount(Map<Product, Integer> pCart) {
        discCart = pCart;
    }

    public int evaluateDiscount() {
        for (Map.Entry<Product, Integer> entry : discCart.entrySet()) {
            totalDiscount += entry.getKey().discount() * entry.getValue();
        }
        return totalDiscount;
    }
}
