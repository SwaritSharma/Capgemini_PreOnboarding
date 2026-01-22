package objectmodeling.ecommerce;

public class Test {
    static void main() {
        Product laptop = new Product("Laptop", 1200.00);
        Product mouse = new Product("Mouse", 25.00);
        Product keyboard = new Product("Keyboard", 45.00);

        Customer customer = new Customer("John");

        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(mouse);
        order1.addProduct(keyboard);

        customer.placeOrder(order1);

        customer.showOrders();

    }
}
