package app.controller;

import app.model.AverageByCredentials;
import app.model.HighestValues;
import app.view.Show;
import app.dataproviders.ProductBase;
import app.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductStore {
    public void start() {
        ProductBase productBase = new ProductBase();
        List<Product> products = productBase.getProductBase();
        Map<String, Double> averagePricesByCategory = AverageByCredentials.calculateAveragePricesByCategory(products);
        Show.messageToDisplay("Cередня ціну продуктів в кожній категорії: ");
        Show.mapToDisplay(averagePricesByCategory);
        Show.messageToDisplay("-------------------------------------------");
        String categoryWithHighestAvgPrice = HighestValues.calculateCategoryWithHighestAvgPrice(products);
        Show.messageToDisplay("\nКатегорія з найвищою середньою ціною: ");
        Show.messageToDisplay(categoryWithHighestAvgPrice);
    }


}