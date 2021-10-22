package Product;

import java.util.Calendar;

public class Laptop extends Product implements Discountable {
    private int displaySize;
    private String color;

    private final int DISCTIME1 = 22;
    private final int DISCTIME2 = 23;
    private final int DISCVALUE1 = 2;
    private final int DISCVALUE2 = 3;
    private final int DEFDISCVALUE = 0;

    public Laptop(int productId, int price, String name, int weight, int displaySize, String color) {
        super(productId, price, name, weight);
        this.displaySize = displaySize;
        this.color = color;
    }

    @Override
    public int discount() {
        int result;
       int tmp = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        switch (tmp) {
            case (DISCTIME1):
                result = DISCVALUE1;
                break;
            case (DISCTIME2):
                result = DISCVALUE2;
                break;
            default:
                result = DEFDISCVALUE;
                break;

        }
        return result;
    }
}

