package objectmodeling.ecommerce;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order.");
    }

    void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}
