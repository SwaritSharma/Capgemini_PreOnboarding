package gen_assignment.dynamic_online_market_place;

public abstract class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

