package B9;

import java.util.List;

public interface ProductProcessor {
    float calculateTotalValue(List<Product> products);
    static void printProductList(List<Product> products){
        for(Product product : products){
            System.out.println(product.getName());
        }
    };
    default void hasExpensiveProduct(List<Product> products){
        for(Product product : products){
            if(product.getPrice() > 100){
                System.out.println(product.getName());
            }
        }
    }
}
