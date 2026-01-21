package FourPillars.ecommerce;

public class Electronics  extends Product implements Taxable{


    Electronics(int productId,String name,int price)
    {
        super(productId,name,price);
    }

    @Override
    public double calculateTax() {
        return getPrice()*.34;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on Product: "+calculateTax());
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }
}
