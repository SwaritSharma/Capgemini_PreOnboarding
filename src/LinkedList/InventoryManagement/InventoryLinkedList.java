package LinkedList.InventoryManagement;

import LinkedList.Node;

public class InventoryLinkedList {

    private Node<Item> head;


    public void addAtBeginning(Item item) {
        Node<Item> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(Item item) {
        Node<Item> newNode = new Node<>(item);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<Item> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(int pos, Item item) {
        if (pos <= 0) return;

        if (pos == 1) {
            addAtBeginning(item);
            return;
        }

        Node<Item> temp = head;
        int c = 1;

        while (temp != null && c < pos - 1) {
            temp = temp.next;
            c++;
        }

        if (temp == null) return;

        Node<Item> newNode = new Node<>(item);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByItemId(String itemId) {

        if (head == null) return;

        if (head.data.getItemId().equals(itemId)) {
            head = head.next;
            return;
        }

        Node<Item> temp = head;
        while (temp.next != null) {
            if (temp.next.data.getItemId().equals(itemId)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void updateQuantity(String itemId, int newQuantity) {
        Node<Item> temp = head;

        while (temp != null) {
            if (temp.data.getItemId().equals(itemId)) {
                temp.data.setQuantity(newQuantity);
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByItemId(String itemId) {
        Node<Item> temp = head;

        while (temp != null) {
            if (temp.data.getItemId().equals(itemId)) {
                printItem(temp.data);
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByItemName(String name) {
        Node<Item> temp = head;

        while (temp != null) {
            if (temp.data.getItemName().equalsIgnoreCase(name)) {
                printItem(temp.data);
            }
            temp = temp.next;
        }
    }

    public double calculateTotalValue() {
        double total = 0;
        Node<Item> temp = head;

        while (temp != null) {
            total += temp.data.getPrice() * temp.data.getQuantity();
            temp = temp.next;
        }
        return total;
    }

    public void sortByNameAscending() {
        head = mergeSort(head, true);
    }

    public void sortByPriceDescending() {
        head = mergeSort(head, false);
    }

    private Node<Item> mergeSort(Node<Item> h, boolean byName) {
        if (h == null || h.next == null) return h;

        Node<Item> mid = getMiddle(h);
        Node<Item> next = mid.next;
        mid.next = null;

        Node<Item> left = mergeSort(h, byName);
        Node<Item> right = mergeSort(next, byName);

        return merge(left, right, byName);
    }

    private Node<Item> merge(Node<Item> a, Node<Item> b, boolean byName) {

        if (a == null) return b;
        if (b == null) return a;

        Node<Item> result;

        if (byName) {
            if (a.data.getItemName().compareToIgnoreCase(b.data.getItemName()) <= 0) {
                result = a;
                result.next = merge(a.next, b, true);
            } else {
                result = b;
                result.next = merge(a, b.next, true);
            }
        } else {
            if (a.data.getPrice() >= b.data.getPrice()) {
                result = a;
                result.next = merge(a.next, b, false);
            } else {
                result = b;
                result.next = merge(a, b.next, false);
            }
        }
        return result;
    }

    private Node<Item> getMiddle(Node<Item> h) {
        Node<Item> slow = h;
        Node<Item> fast = h.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void display() {
        Node<Item> temp = head;
        while (temp != null) {
            printItem(temp.data);
            temp = temp.next;
        }
    }

    private void printItem(Item i) {
        System.out.println(
                "ItemId=" + i.getItemId() +
                        ", Name=" + i.getItemName() +
                        ", Qty=" + i.getQuantity() +
                        ", Price=" + i.getPrice()
        );
    }
}
