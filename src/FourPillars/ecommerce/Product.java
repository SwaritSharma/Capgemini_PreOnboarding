package FourPillars.ecommerce;

public  abstract class Product {
    private int productID;
    private String name;
    private double price;

    public Product(int productID,String name,double price)
    {
        this.productID=productID;
        this.name=name;
        this.price=price;
    }
    abstract double calculateDiscount();
    public void getTaxDetails() {
        System.out.println("Product name: "+name);
        System.out.println("Product ID: "+productID);
        System.out.println("Product Price: "+price);    }
    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductID() {
        return productID;
    }

}
