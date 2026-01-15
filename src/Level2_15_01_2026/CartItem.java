package Level2_15_01_2026;

class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Item Added");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Item Removed");
        } else {
            System.out.println("Not enough items to remove");
        }
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {

        CartItem item = new CartItem();
        item.itemName = "Notebook";
        item.price = 50;

        item.addItem(4);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
