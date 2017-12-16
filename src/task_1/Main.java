package task_1;

/**
 * Created by Lena on 12/15/2017.
 * 1. Создать 3 класса, описывающие 2 типа некоего товара. Один из классов – базовый,
 * второй и третий – описывают типы товаров. В первом – обязательны поля «цена» и «название». В наследниках должны быть объявлены новые поля.
 * <p>
 * 1.1. В классах должны быть два конструктора: пустой и параметризованный, методы get set для каждого поля,
 * метод public String toString(), возвращающий строковое представление объекта.
 * <p>
 * 1.2. Базовый класс должен быть абстрактным.
 * <p>
 * 1.3. При помощи статических полей и метода найти и отпечатать среднюю цену товара.
 * <p>
 * 2. Создать контейнер для хранения товаров. В нем должны быть реализованы методы Add, Count, метод доступа по индексу,
 * сортировки по цене и печати содержимого.
 * <p>
 * 3. Заполнить контейнер, распечатать, отсортировать, распечатать.
 */
public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        Laptop lap2 = new Laptop("Lenovo laptop", 1000.00, "core i7");
        Tv tv1 = new Tv();
        Tv tv2 = new Tv("Sumsung", 2000.00, "Full HD");

        Container container = new Container();
        container.addProduct(lap1);
        container.addProduct(lap2);
        container.addProduct(tv1);
        container.addProduct(tv2);

        System.out.println("Products list:");
        container.printProductsList();

        System.out.println("\nCount of products: " + container.countProducts());

        System.out.println("Average price:" + container.getAveragePrice());

        System.out.println("Get product by index:");
        System.out.println(container.getProductByIndex(2));

        container.sortByPrice();
        System.out.println("\nProducts sorted by price:");
        container.printProductsList();
    }
}
