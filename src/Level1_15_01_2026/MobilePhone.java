package Level1_15_01_2026;

class Item {

    int itemCode;
    String itemName;
    double price;

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost for " + quantity + " items: " + total);
    }

    public static void main(String[] args) {

        Item item = new Item();
        item.itemCode = 201;
        item.itemName = "Pen";
        item.price = 10;

        item.displayItemDetails();
        item.calculateTotalCost(5);
    }
}
