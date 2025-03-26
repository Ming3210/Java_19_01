package B9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 50f));
        products.add(new Product("Banana", 151f));
        products.add(new Product("Orange", 52f));
        products.add(new Product("Pear", 53f));
        products.add(new Product("Durian", 150f));

        ProductProcessorImpl p = new ProductProcessorImpl();

        System.out.println("Các sản phẩm có giá lớn hơn 100:");
        p.hasExpensiveProduct(products);

        float totalValue =  p.calculateTotalValue(products);
        System.out.println("Tổng giá trị của tất cả sản phẩm: " + totalValue);

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);

    }
}
