package Javaeight;

import java.util.*;
import java.util.stream.*;

public class ProductSalesAnalysis {
    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale("P1", 15, 100),
                new Sale("P2", 8, 200),
                new Sale("P3", 20, 150),
                new Sale("P4", 25, 50),
                new Sale("P5", 12, 300),
                new Sale("P6", 30, 80)
        );

        sales.stream()
                .filter(s -> s.quantity > 10)
                .map(s -> new ProductSales(s.productId, s.quantity * s.price))
                .sorted((a, b) -> Double.compare(b.revenue, a.revenue))
                .limit(5)
                .forEach(p -> System.out.println(p.productId + " " + p.revenue));
    }
}
