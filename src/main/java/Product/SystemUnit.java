package Product;

import java.util.Calendar;

public class SystemUnit extends Product implements Discountable {
    private String color;

    private final int DISCTIME = 20;
    private final int DISCVALUE = 3;
    private final int DEFDISCVALUE = 0;

    public SystemUnit(int productId, int price, String name, int weight, String color) {
        super(productId, price, name, weight);
        this.color = color;

    }

    @Override
    public int discount() {
        int tmp = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (tmp <= DISCTIME) return DISCVALUE;
        else return DEFDISCVALUE;
    }
}
