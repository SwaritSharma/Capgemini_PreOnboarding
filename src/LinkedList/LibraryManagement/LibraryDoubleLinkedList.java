package LinkedList.LibraryManagement;

import LinkedList.Node;

public class LibraryDoubleLinkedList {

    private Node<Book> head;
    private Node<Book> tail;

    public void addAtBeginning(Book book) {
        Node<Book> newNode = new Node<>(book);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addAtEnd(Book book) {
        Node<Book> newNode = new Node<>(book);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtPosition(int pos, Book book) {
        if (pos <= 0) return;

        if (pos == 1) {
            addAtBeginning(book);
            return;
        }

        Node<Book> temp = head;
        int c = 1;

        while (temp != null && c < pos - 1) {
            temp = temp.next;
            c++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(book);
            return;
        }

        Node<Book> newNode = new Node<>(book);
        Node<Book> join = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = join;
        join.prev = newNode;
    }

    public void removeByBookId(String bookId) {

        if (head == null) return;

        // remove head
        if (head.data.getBookId().equals(bookId)) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        Node<Book> temp = head;

        while (temp != null) {
            if (temp.data.getBookId().equals(bookId)) {

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }

                temp.prev.next = temp.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByTitle(String title) {
        Node<Book> temp = head;

        while (temp != null) {
            if (temp.data.getTitle().equalsIgnoreCase(title)) {
                printBook(temp.data);
            }
            temp = temp.next;
        }
    }

    public void searchByAuthor(String author) {
        Node<Book> temp = head;

        while (temp != null) {
            if (temp.data.getAuthor().equalsIgnoreCase(author)) {
                printBook(temp.data);
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(String bookId, boolean status) {
        Node<Book> temp = head;

        while (temp != null) {
            if (temp.data.getBookId().equals(bookId)) {
                temp.data.setAvailable(status);
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        Node<Book> temp = head;
        while (temp != null) {
            printBook(temp.data);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Node<Book> temp = tail;
        while (temp != null) {
            printBook(temp.data);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Node<Book> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void printBook(Book b) {
        System.out.println(
                "BookId=" + b.getBookId() +
                        ", Title=" + b.getTitle() +
                        ", Author=" + b.getAuthor() +
                        ", Genre=" + b.getGenre() +
                        ", Available=" + b.isAvailable()
        );
    }
}
