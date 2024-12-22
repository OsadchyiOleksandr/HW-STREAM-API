package app.controller;

import app.view.ProductView;
import app.model.ProductModel;
import app.entity.Product;

import java.util.List;
import java.util.Map;

public class ProductController {
    public void runApp() {
        ProductModel productModel = new ProductModel();
        List<Product> products = productModel.getProductBase();
        Map<String, Double> averagePricesByCategory = productModel.calculateAveragePricesByCategory(products);
        ProductView.messageToDisplay("Cередня ціну продуктів в кожній категорії: ");
        ProductView.mapToDisplay(averagePricesByCategory);
        ProductView.messageToDisplay("-------------------------------------------");
        String categoryWithHighestAvgPrice = productModel.calculateCategoryWithHighestAvgPrice(products);
        ProductView.messageToDisplay("\nКатегорія з найвищою середньою ціною: ");
        ProductView.messageToDisplay(categoryWithHighestAvgPrice);
    }


}