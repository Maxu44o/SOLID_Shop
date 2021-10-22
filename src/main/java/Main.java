import Person.Customer;
import Person.Employee;
import Person.PersonBuilder;
import Depot.PostPoint;
import Depot.Depot;
import Product.Laptop;
import Product.Monitor;
import Product.Product;
import Product.SystemUnit;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        Customer a = new PersonBuilder().setName("A").setAge(20).setEmail("b@mail.ru").builtCustomer();
        Employee b = new PersonBuilder().setName("B").setAge(10).builtEmployee();
        Customer c = new PersonBuilder().setName("C").setAge(20).setEmail("b@mail.ru").builtCustomer();


        PostPoint pp = new PostPoint(new HashMap<Product, Integer>());
        Depot dep = new Depot(new HashMap<Product, Integer>());

        Monitor m = new Monitor(2, 20, "LG", 19, 4);
        SystemUnit su = new SystemUnit(5, 30, "Lenovo", 8, "white");
        Laptop lt = new Laptop(8, 40, "DELL", 6, 19, "Black");

        b.addToDepot(pp, m, 5);
        b.addToDepot(pp, m, 5);
        b.addToDepot(pp, su, 10);
        b.addToDepot(pp, lt, 1);
        b.addToDepot(pp, lt, 2);
        b.addToDepot(pp, m, 5);
        pp.showRemains();

        a.openCart(pp);
        a.addToCart(m, 2);
        a.addToCart(m, 5);
        a.addToCart(su, 1);
        a.addToCart(lt, 3);
        a.purchase();
        pp.showRemains();

        a.openCart(pp);
        a.addToCart(m, 2);
        a.purchase();
        pp.showRemains();

        c.openCart(dep);
        c.addToCart(m, 6);
        c.addToCart(lt, 6);
        c.purchase();
        dep.showRemains();

/*         int date = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

          System.out.println(date);*/
    }
}
