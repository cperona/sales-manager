package org.example;

import java.util.ArrayList;

public class Sale {
    ArrayList<Product> products = new ArrayList<>();
    private int totalPrice;

    public Sale(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
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
        } else {
            //Sum all products prices
            for (Product p : products) {
                totalPrice += p.getPrice();
            }
        }
    }

    //Forces an IndexOutOfBoundException
    public void indexOutOfBoundExceptionTest() {
        try {
            products.get(1000);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("This is an IndexOutOfBoundException");
        }
    }
}
