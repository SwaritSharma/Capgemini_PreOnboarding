package Level1_16_01_2026;

public class Product {
    private String productName;
    private int price;
    static int totalProducts=0;

    Product(String productName,int price)
    {
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    Product(Product product)
    {
        this.productName=product.productName;
        this.price=product.price;
        totalProducts++;
    }

    public void displayProductDetails()
    {
        System.out.println("Product's Name: "+productName);
        System.out.println("Product's Price: "+price);
    }
    public static void displayTotalProducts()
    {
        System.out.println("Total Products: "+totalProducts);
    }
}
