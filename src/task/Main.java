package task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("candy", 4, 2000);
        Product product1 = new Product("sugar", 20, 5000);
        Product product2 = new Product("butter", 2, 10000);
        System.out.println("Product name is: " + product.getName() + " Product uniqueId is: " + product.getUniqueId() + " Product weight is: " + product.getWeight() + " Product value is:" + product.getValue());
        System.out.println("Product name is: " + product1.getName() + " Product uniqueId is: " + product1.getUniqueId() + " Product weight is: " + product1.getWeight() + " Product value is:" + product1.getValue());
        System.out.println("Product name is: " + product2.getName() + " Product uniqueId is: " + product2.getUniqueId() + " Product weight is: " + product2.getWeight() + " Product value is:" + product2.getValue());
    }
}
