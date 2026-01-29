package Stack_Queue_HashMap_HashingFunction;

class MyHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] table;
    private int capacity = 16;
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        table = new Node[capacity];
    }

    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int h = hash(key);
        if (table[h] == null) {
            table[h] = new Node<>(key, value);
        } else {
            Node<K, V> curr = table[h];
            while (true) {
                if ((curr.key == null && key == null) || (curr.key != null && curr.key.equals(key))) {
                    curr.value = value;
                    return;
                }
                if (curr.next == null)
                    break;
                curr = curr.next;
            }
            curr.next = new Node<>(key, value);
        }
    }

    public V get(K key) {
        int h = hash(key);
        Node<K, V> curr = table[h];
        while (curr != null) {
            if ((curr.key == null && key == null) || (curr.key != null && curr.key.equals(key))) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public void remove(K key) {
        int h = hash(key);
        Node<K, V> curr = table[h];
        Node<K, V> prev = null;
        while (curr != null) {
            if ((curr.key == null && key == null) || (curr.key != null && curr.key.equals(key))) {
                if (prev == null) {
                    table[h] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("One", 11);
        System.out.println("Get One: " + map.get("One"));
        map.remove("One");
        System.out.println("Get One after remove: " + map.get("One"));
        System.out.println("Get Two: " + map.get("Two"));
    }
}
