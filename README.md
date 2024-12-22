    1. Створіть клас Product з полями name, category та price.
    2. Створіть список об'єктів класу Product.
    3. Використовуючи Stream API:

      *  Згрупуйте продукти за їхніми категоріями.
      *  Знайдіть середню ціну продуктів в кожній категорії.
      *  Знайдіть категорію з найвищою середньою ціною та виведіть її в консоль.

	  4.Залийте виконаний проект в свій GitHub репозиторій, посилання на який зазначте в LMS

Приклад реалізації:

// Product.java
public class Product {
  private String name;
  private String category;
  private double price;

// Конструктор та геттери/сеттери
  public Product(String name, String category, double price) {
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", category='" + category + '\'' +
        ", price=" + price +
        '}';
  }
}

// Main.java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product("Laptop", "Electronics", 1200.0),
        new Product("Coffee Maker", "Appliances", 80.0),
        new Product("Headphones", "Electronics", 150.0),
        new Product("Blender", "Appliances", 50.0)
    );

    Map<String, Double> result = products.stream()
        .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

    System.out.println("Результат: " + result);
  }
}

