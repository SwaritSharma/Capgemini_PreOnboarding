package CollectionFramework;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>(); 

    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    public void addToCart(String name, int quantity) {
        cart.put(name, cart.getOrDefault(name, 0) + quantity);
    }

    public void displayCart() {
        System.out.println("Shopping Cart (Insertion Order)");
        cart.forEach((name, qty) -> System.out.println(name + " x" + qty + " @ $" + productPrices.get(name)));
    }

    public void displaySortedByPrice() {
        System.out.println("\nIndividual Item Prices (Sorted by Price)");
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();
        productPrices.forEach((name, price) -> {
            sortedByPrice.computeIfAbsent(price, p -> new ArrayList<>()).add(name);
        });

        sortedByPrice.forEach((price, names) -> {
            for (String name : names) {
                System.out.println(name + ": $" + price);
            }
        });
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct("Laptop", 1200.0);
        sc.addProduct("Mouse", 25.0);
        sc.addProduct("Keyboard", 45.0);
        sc.addProduct("Monitor", 300.0);

        sc.addToCart("Mouse", 1);
        sc.addToCart("Laptop", 1);
        sc.addToCart("Keyboard", 1);

        sc.displayCart();
        sc.displaySortedByPrice();
    }
}
