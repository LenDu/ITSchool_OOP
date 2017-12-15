/**
 * Created by Lena on 12/14/2017.
 */
public class Laptop extends Product {
    private String processor;

    public Laptop() {
        super.name = "N/A";
        super.price = 0.00;
        this.processor = "N/A";
    }

    public Laptop(String name, Double price, String processor) {
        super(name, price);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                super.toString() +
                "processor='" + processor + '\'' +
                "} ";
    }
}
