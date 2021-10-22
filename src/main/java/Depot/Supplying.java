package Depot;

import Product.Product;

public interface Supplying {
    void ship(Product product, Integer amount);
    int getDistanceDeliveryCost();
    void showRemains();
    boolean isAvailable(Product product, int quantity);
    String getSupplyName();
}
