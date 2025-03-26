package B9;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor{
    @Override
    public float calculateTotalValue(List<Product> products){
        float totalValue = 0;
        for(Product product : products){
            totalValue += product.getPrice();
        }
        return totalValue;
    }


}
