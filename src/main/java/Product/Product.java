package Product;

public class Product implements Deliverable,Discountable {
    private int productId;
    private int price;
    private String name;
    private int weight;

    private final int WEIGHTTHRESHOLD = 5;
    private final int DEFMAXDELCOST = 2;
    private final int DEFMINDELCOST = 0;

    public Product(int productId, int price, String name, int weight) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public int getProductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Id=" + productId +
                ", price=" + price + "$" + "  (" + name + ")";
    }

    @Override
    public int estimateDelivery() {
        if (weight >= WEIGHTTHRESHOLD) return DEFMAXDELCOST;
        else return DEFMINDELCOST;
    }

    @Override
    public int discount() {
        return 0;
    }
}


