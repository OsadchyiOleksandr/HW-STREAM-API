package app.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageByCredentials {
    public static Map<String, Double> calculateAveragePricesByCategory(List<Product> products){
        Map<String, Double> averagePricesByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
        return averagePricesByCategory;
    }
}
