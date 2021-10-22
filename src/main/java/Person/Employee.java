package Person;

import Depot.PostPoint;
import Product.Product;

public class Employee extends Person {
    public Employee(PersonBuilder personBuilder) {
        super(personBuilder);
    }

    public void addToDepot(PostPoint depot, Product product, int quantity) {
        depot.supply(product, quantity);
    }

}
