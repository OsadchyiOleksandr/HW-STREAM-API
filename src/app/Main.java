package app;

import app.controller.ProductStore;

public class Main {
    public static void main(String[] args) {
        ProductStore productStore = new ProductStore();
        productStore.start();
    }
}
