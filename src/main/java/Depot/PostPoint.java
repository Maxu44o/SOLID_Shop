package Depot;

import Product.Product;

import java.util.Map;

public class PostPoint implements Supplying {

    public PostPoint(Map<Product, Integer> storage) {
        this.storage = storage;
    }

    public Map<Product, Integer> storage;

    @Override
    public void ship(Product product, Integer quantity) {
        int tmp = storage.get(product);
        storage.put(product, tmp - quantity);
    }

    @Override
    public int getDistanceDeliveryCost() {
        return 10;
    }

    public void supply(Product product, Integer quantity) {
        if (storage.get(product) == null) {
            storage.put(product, quantity);
        } else {
            int tmp = storage.get(product);
            storage.put(product, tmp + quantity);
        }
    }

    public void showRemains() {
        System.out.println("В автомате осталось осталось:");
        for (Map.Entry<Product, Integer> entry : storage.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        System.out.println("===============" + "\n");
    }

    @Override
    public boolean isAvailable(Product product, int quantity) {
        return storage.get(product) >= quantity;
    }

    @Override
    public String getSupplyName() {
        return "Автомат";
    }


}
