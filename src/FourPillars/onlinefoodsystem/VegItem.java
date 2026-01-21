package FourPillars.onlinefoodsystem;

class VegItem extends FoodItem implements Discountable {

    private static final double DISCOUNT_RATE = 0.10;

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "10% vegetarian discount applied";
    }
}

