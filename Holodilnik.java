package Lesson14;

import java.util.*;

public class Holodilnik implements lesson14.IHolodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void putProducts(String product, int value) {
        if (products.containsKey(product)) {
            int currentValue = products.get(product);
            products.put(product, value + currentValue);
        } else {
            products.put(product, value);
        }
    }

    public void printAllProducts() {
        for (String key: products.keySet()) {
            System.out.println(key + " - " + products.get(key) + "kg");
        }
        System.out.println("\n");
    }

    public void getProduct(String product, int value) {
        if (products.containsKey(product)) {
            if (value > products.get(product)) {
                System.out.println("Not enough " + product + " in HOLODILNIK");
            }
            else {
                int currentValue = products.get(product);
                products.put(product, currentValue - value);
            }
        }
        else {
            System.out.println("There is no such product (" + product + ") in HOLODILNIK!");
        }
    }

    public void printAllNetto () {
        int netto = 0;
        for (String key: products.keySet()) {
            netto = netto + products.get(key);
        }
        System.out.println(netto);
    }

    @Override
    public void getProductsInOrder() {
        TreeMap<String, Integer> sortedProducts = new TreeMap<>(this.products);
        if (sortedProducts.isEmpty()) {
            System.out.println("HOLODILNIK IS EMPTY! FILL THE HOLODILNIK!");
        }
        for (Map.Entry<String, Integer> product: sortedProducts.entrySet()) {
            System.out.println(product.getKey() + " " + product.getValue());
        }
    }

    @Override
    public void productWithMaxAmount() {
        if (products.isEmpty()) {
            System.out.println("HOLODILNIK IS EMPTY! FILL THE HOLODILNIK!");
        }
        int result = -1;
        for (Map.Entry<String, Integer> entry: products.entrySet()) {
            if (entry.getValue() >= result) {
                result = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry: products.entrySet())
            if (result == entry.getValue()) {
                System.out.println("Biggest amount of products in the HOLODILNIK has " + entry.getKey() + ": " + entry.getValue());
            }
    }

    @Override
    public void productWithMinAmount() {
        if (products.isEmpty()) {
            System.out.println("HOLODILNIK IS EMPTY! FILL THE HOLODILNIK!");
        }
        int result = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry: products.entrySet()) {
            if (entry.getValue() <= result) {
                result = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry: products.entrySet())
            if (result == entry.getValue()) {
                System.out.println("Smallest amount of products in the HOLODILNIK has " + entry.getKey() + ": " + entry.getValue());
            }
    }

    @Override
    public void productAmount(String s) {
        if (products.isEmpty()) {
            System.out.println("HOLODILNIK IS EMPTY! FILL THE HOLODILNIK!");
        }
        boolean found = false;
        for (Map.Entry<String, Integer> entry: products.entrySet()) {
            if (entry.getKey() == s) {
                System.out.println(entry.getKey() + " weight is " + entry.getValue() + " kg" );
                found = true;
                break;
            }
        } if (!found) {
            System.out.println("There is no such product (" + s +  ") in the HOLODILNIK");
        }
//        if (products.get(s) == null) {
//            System.out.println("There is no such product (" + s +  ") in the HOLODILNIK");
//        }  else {
//            System.out.println(s + " weight is " + products.get(s) + " kg");
//        }
    }

    @Override
    public void getMinSet(int n) {
        if (products.isEmpty()) {
            System.out.println("HOLODILNIK IS EMPTY! FILL THE HOLODILNIK!");
        }
        for (Map.Entry<String, Integer> entry: products.entrySet()) {
            if (entry.getValue() < n) {
                System.out.println("Amount of products less then " + n +" has " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
