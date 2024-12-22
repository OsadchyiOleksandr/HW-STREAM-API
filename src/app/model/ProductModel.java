package app.model;

import app.entity.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductModel {
    private List<Product> productsBase = Arrays.asList(
            new Product("Laptop", "Electronics", 1200.0),
            new Product("Coffee Maker", "Appliances", 80.0),
            new Product("Headphones", "Electronics", 150.0),
            new Product("Blender", "Appliances", 50.0)
    );

    public Map<String, Double> calculateAveragePricesByCategory(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
    }

    public String calculateCategoryWithHighestAvgPrice(List<Product> products){
        Map<String, Double> averagePricesByCategory = calculateAveragePricesByCategory(products);
        Optional<String> categoryWithHighestAvgPrice = averagePricesByCategory.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        return categoryWithHighestAvgPrice.orElse("Категорії нема");
    }

    public List<Product> getProductBase(){
        return productsBase;
    }
}
