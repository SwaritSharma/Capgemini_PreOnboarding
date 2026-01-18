package Level1_18_01_2026;
class Product {
    static double discount = 10.0;

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    String productName;
    double price;
    int quantity;
    final String productID;

    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product prod = (Product) obj;
            System.out.println("Product ID: " + prod.productID);
            System.out.println("Product Name: " + prod.productName);
            System.out.println("Price: " + prod.price);
            System.out.println("Quantity: " + prod.quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Object is not a Product instance.");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0, 5, "P001");
        p1.displayProductDetails(p1);

        Product.updateDiscount(15.0);
        System.out.println("After updating discount:");
        p1.displayProductDetails(p1);
    }
}
