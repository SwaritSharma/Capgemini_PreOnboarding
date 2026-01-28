package LinkedList.TextEditor;

import LinkedList.Node;

public class TextEditorUndoRedo {

    private Node<TextState> head;
    private Node<TextState> tail;
    private Node<TextState> current;

    private final int MAX_HISTORY = 10;
    private int size = 0;

    public void addState(String text) {

        Node<TextState> newNode = new Node<>(new TextState(text));

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = recalcSize();
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Limit history
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.data.getContent());
        }
    }

    private int recalcSize() {
        int count = 0;
        Node<TextState> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
