import java.util.Arrays;

/**
 * Created by Lena on 12/15/2017.
 */
public class Container {
    Product[] products;

    public Container() {
        this.products = new Product[1];
    }

    void addProduct(Product product) {
        if (this.products[0] == null) {
            this.products[0] = product;
        } else {
            Product[] copyProducts = new Product[products.length];
            System.arraycopy(products, 0, copyProducts, 0, products.length);
            this.products = new Product[copyProducts.length + 1];
            System.arraycopy(copyProducts, 0, products, 0, copyProducts.length);
            products[products.length - 1] = product;
        }
    }

    int countProducts() {
        ;
        return this.products.length;
    }

    Product getProductByIndex(int index) {
        if (index < this.products.length) {
            return this.products[index];
        } else throw new IllegalArgumentException();
    }

    double getAveragePrice() {
        return AveragePrice.calcAveragePrice(products);
    }


    void sortByPrice(){

        for (int j = products.length - 1; j >= 0; j--) {
            for (int i = 0; i < products.length - 1; i++) {
                if (products[i].getPrice() > products[i + 1].getPrice()) {
                    Product temp = products[i];
                    products[i] = products[i + 1];
                    products[i + 1] = temp;
                }
            }
        }
    }


    void printProductsList(){
        for (int i = 0; i < products.length; i++) {
            System.out.println((products[i]));
        }
    }




}
