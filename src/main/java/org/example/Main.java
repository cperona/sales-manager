package org.example;

import java.util.ArrayList;

public class Main {
    public static void main() {
        //Create a new sale and add some products
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Clock", 12));
        products.add(new Product("Calculator", 9));
        Sale sale1 = new Sale(products);

        //Calculate total sale price
        sale1.calculateTotal();
        System.out.printf("Sale total price: %d", sale1.getTotalPrice());

        //Force an IndexOutOfBoundException
        sale1.indexOutOfBoundExceptionTest();
    }
}
