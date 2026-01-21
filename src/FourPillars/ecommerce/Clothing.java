package FourPillars.ecommerce;

public class Clothing extends Product implements Taxable{
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax: 5%");
    }
}
