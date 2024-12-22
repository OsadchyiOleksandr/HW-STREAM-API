package app.controller;

import app.view.ProductView;
import app.model.ProductModel;
import app.entity.Product;

import java.util.List;
import java.util.Map;

public class ProductController {
    ProductView productView = new ProductView();
    ProductModel productModel = new ProductModel();

    public void runApp() {
        List<Product> products = productModel.getProductBase();
        Map<String, Double> averagePricesByCategory = productModel.calculateAveragePricesByCategory(products);
        productView.messageToDisplay("Cередня ціну продуктів в кожній категорії: ");
        productView.mapToDisplay(averagePricesByCategory);
        productView.messageToDisplay("-------------------------------------------");
        String categoryWithHighestAvgPrice = productModel.calculateCategoryWithHighestAvgPrice(products);
        productView.messageToDisplay("\nКатегорія з найвищою середньою ціною: " + categoryWithHighestAvgPrice);
    }
}