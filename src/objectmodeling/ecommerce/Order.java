package objectmodeling.ecommerce;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + " : $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}
