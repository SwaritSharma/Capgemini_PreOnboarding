package FourPillars.onlinefoodsystem;

class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50.0;

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount with non-veg handling charges";
    }
}
