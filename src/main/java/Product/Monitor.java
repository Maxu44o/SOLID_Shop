package Product;

import java.util.Calendar;

public class Monitor extends Product implements Discountable {
    private int displaySize;

    private final int DISCTIME1 = 20;
    private final int DISCTIME2 = 21;
    private final int DISCVALUE1 = 1;
    private final int DISCVALUE2 = 2;
    private final int DEFDISCVALUE = 0;

    public Monitor(int productId, int price, String name, int displaySize, int weight) {
        super(productId, price, name, weight);
        this.displaySize = displaySize;
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
