package gen_assignment.dynamic_online_market_place;

public class DiscountUtil {

    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() -
                (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
    }
}

