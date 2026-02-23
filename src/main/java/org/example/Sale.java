package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private int totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() {
        //Check if products ArrayList is empty
        if (products.isEmpty()) {
            throw new EmptySaleException("You have to add products first to products ArrayList");
        }
        //Sum all products prices
        this.totalPrice = 0;
        for (Product p : products) {
            this.totalPrice += p.getPrice();
        }
    }

    public void addProduct(String name, int price) {
        this.products.add(new Product(name, price));
    }

    //Forces an IndexOutOfBoundException
    public void indexOutOfBoundExceptionTest() {
        try {
            products.get(1000);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("\nThis is an IndexOutOfBoundException");
        }
    }
}