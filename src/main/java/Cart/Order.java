package Cart;


import Product.Product;

import java.util.*;

public class Order {
    private static int orderId = 0;
    Cart cart;
    Delivery delivery;
    Discount discount;

    private Map<Product, Integer> pCart = new HashMap<>();

    public Order(Cart cart, Delivery delivery, Discount discount) {
        this.cart = cart;
        this.delivery = delivery;
        this.discount = discount;
        orderId++;
    }

    public void printOrder() {
        System.out.println("Order #" + orderId + "со склада: " + cart.getSupplying().getSupplyName());
        for (Map.Entry<Product, Integer> entry : cart.getCart().entrySet()) {
            System.out.println(entry.getValue() + "pcs   " + entry.getKey());
        }
        int del = delivery.evaluateDelivery();
        int disc = discount.evaluateDiscount();
        int cost = cart.estimatePrice();
        System.out.println("Product cost: " + cost + "$");
        System.out.println("Discount: " + disc + "$");
        System.out.println("Delivery cost: " + del + "$");
        System.out.println("Total: " + (cost + del - disc) + "$");
        System.out.println("===============" + "\n");
    }


}



