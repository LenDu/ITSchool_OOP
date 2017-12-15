/**
 * Created by Lena on 12/14/2017.
 */

public abstract class Product {
    protected String name;
    protected Double price;
    static double averagePrice;

    public Product() {
        this.name = "N/A";
        this.price = 0.00;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static double averagePrice(Product[] product) {
        double sum = 0;

        for (Product elem : product) {
            sum = +elem.getPrice();
        }
        return averagePrice = sum / product.length;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price + "$, ";
    }
}
