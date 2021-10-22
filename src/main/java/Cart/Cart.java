package Cart;

import Depot.Supplying;
import Product.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Supplying supplying;
    private Map<Product, Integer> pCart = new HashMap<>();
    private int estimateCostPrice;

    public Cart(Supplying supplying) {
        this.supplying = supplying;
    }

    public void addproduct(Product product, int quantity) {
        if (supplying.isAvailable(product, quantity)) {
            if (pCart.get(product) == null) {
                pCart.put(product, quantity);
            } else {
                int tmp = pCart.get(product);
                pCart.put(product, tmp + quantity);
            }
            supplying.ship(product, quantity);
        } else System.out.println("Товара артикул  " + product.getProductId() + " недостаточно на складе");
    }

    public Map<Product, Integer> getCart() {
        return pCart;
    }

    public Supplying getSupplying() {
        return supplying;
    }

    public int estimatePrice() {
        for (Map.Entry<Product, Integer> entry : pCart.entrySet()) {
            estimateCostPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return estimateCostPrice;
    }

}