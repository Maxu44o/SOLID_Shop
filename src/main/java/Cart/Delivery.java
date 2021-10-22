package Cart;

import Depot.Supplying;
import Product.Product;

import java.util.Map;

public class Delivery {
    Map <Product, Integer> delCart;
    private int totalDeliveryCost;
    private Supplying supplying;

    public Delivery (Map<Product,Integer> pCart, Supplying supplying) {
        delCart = pCart;
        this.supplying = supplying;
    };

    public int evaluateDelivery() {
        for (Map.Entry<Product, Integer> entry : delCart.entrySet()) {
            totalDeliveryCost += entry.getKey().estimateDelivery() * entry.getValue();
        }
        totalDeliveryCost += supplying.getDistanceDeliveryCost();
        return totalDeliveryCost;
    }

}
