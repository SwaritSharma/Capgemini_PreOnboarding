package gen_assignment.smart_warehouse;

import java.util.*;

public class Storage<T extends WareHouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Wildcard method (read-only)
    public static void displayItems(List<? extends WareHouseItem> items) {
        for (WareHouseItem i: items) {
            System.out.println(i.getName());
        }
    }
}

