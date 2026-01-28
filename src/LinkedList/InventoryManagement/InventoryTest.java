package LinkedList.InventoryManagement;

public class InventoryTest {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(new Item("I1", "Laptop", 5, 60000));
        inventory.addAtEnd(new Item("I2", "Mouse", 20, 500));
        inventory.addAtBeginning(new Item("I3", "Keyboard", 15, 1500));
        inventory.addAtPosition(2, new Item("I4", "Monitor", 10, 12000));

        System.out.println("Inventory:");
        inventory.display();

        inventory.updateQuantity("I2", 25);

        System.out.println("\nAfter Quantity Update:");
        inventory.display();

        System.out.println("\nSearch by Item Name (Laptop):");
        inventory.searchByItemName("Laptop");

        System.out.println("\nTotal Inventory Value:");
        System.out.println(inventory.calculateTotalValue());

        inventory.sortByNameAscending();
        System.out.println("\nSorted by Name (Ascending):");
        inventory.display();

        inventory.sortByPriceDescending();
        System.out.println("\nSorted by Price (Descending):");
        inventory.display();

        inventory.removeByItemId("I3");
        System.out.println("\nAfter Removing I3:");
        inventory.display();
    }
}

