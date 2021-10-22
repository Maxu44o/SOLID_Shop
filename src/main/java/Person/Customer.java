package Person;

import Cart.Cart;
import Depot.Supplying;
import Cart.Order;
import Cart.Discount;
import Cart.Delivery;
import Product.Product;


public class Customer extends Person {
    private Cart tmpCart;

    public Customer(PersonBuilder personBuilderBuilder) {
        super(personBuilderBuilder);
    }

    public void openCart(Supplying supplying) {
        tmpCart = new Cart(supplying);
    }

    public void addToCart(Product product, int quantity) {
        tmpCart.addproduct(product, quantity);
    }

    public void purchase() {
        Delivery delivery = new Delivery(tmpCart.getCart(), tmpCart.getSupplying());
        Discount discount = new Discount(tmpCart.getCart());
        System.out.println("Покупатель №" + id);
        new Order(tmpCart, delivery, discount).printOrder();
    }


}
