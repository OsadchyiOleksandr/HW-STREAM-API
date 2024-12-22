package app.model;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HighestValues {
    public static String calculateCategoryWithHighestAvgPrice(List<Product> products){
        Map<String, Double> averagePricesByCategory = AverageByCredentials.calculateAveragePricesByCategory(products);
        Optional<String> categoryWithHighestAvgPrice = averagePricesByCategory.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        return categoryWithHighestAvgPrice.orElse("Категорії нема");
    }
}
