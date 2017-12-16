package task_1;

/**
 * Created by Lena on 12/14/2017.
 */
public class Tv extends Product {
    private String hdType;

    public Tv() {
        super.name = "N/A";
        super.price = 0.00;
        this.hdType = "N/A";
    }

    public Tv(String name, Double price, String hdType) {
        super(name, price);
        this.hdType = hdType;
    }

    public String getHdType() {
        return hdType;
    }

    public void setHdType(String hdType) {
        this.hdType = hdType;
    }

    @Override
    public String toString() {
        return "task_1.Tv{" +
                super.toString() +
                "hdType='" + hdType + '\'' +
                "} ";
    }
}
