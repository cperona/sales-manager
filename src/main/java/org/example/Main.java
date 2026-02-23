package org.example;

import java.util.ArrayList;

public class Main {
    public static void main() {
        //Create a new sale and add some products
        Sale sale1 = new Sale();
        sale1.addProduct("Clock", 12);
        sale1.addProduct("Calculator", 9);

        //Calculate total sale price
        sale1.calculateTotal();
        System.out.printf("Sale total price: %d", sale1.getTotalPrice());

        //Force an IndexOutOfBoundException
        sale1.indexOutOfBoundExceptionTest();
    }
}
