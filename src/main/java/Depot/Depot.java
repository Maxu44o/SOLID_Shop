package Depot;

import Product.Product;

import java.util.Map;

public class Depot implements Supplying {

    public Depot(Map<Product, Integer> storage) {
        this.storage = storage;
    }

    public Map<Product, Integer> storage;

    @Override
    public void ship(Product product, Integer quantity) {
    }

    @Override
    public int getDistanceDeliveryCost() {
        return 30;
    }

    @Override
    public void showRemains() {
        System.out.println("На складе осталось осталось еще много");
    }

    @Override
    public boolean isAvailable(Product product, int quantity) {
        return true;
    }

    @Override
    public String getSupplyName() {
        return "Оптовый склад";
    }

}
