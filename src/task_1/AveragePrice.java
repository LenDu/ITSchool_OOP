package task_1;

/**
 * Created by Lena on 12/15/2017.
 */
public class AveragePrice {

    static double calcAveragePrice(Product[] product) {
        double averagePrice;
        double sum = 0;

        for (Product elem : product) {
            sum = sum + elem.getPrice();
        }

        return averagePrice = sum / product.length;
    }
}
