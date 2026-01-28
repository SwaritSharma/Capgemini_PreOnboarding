package LinkedList.LibraryManagement;

public class LibraryTest {

    public static void main(String[] args) {

        LibraryDoubleLinkedList library = new LibraryDoubleLinkedList();

        library.addAtBeginning(
                new Book("B1", "Clean Code", "Robert Martin",
                        "Programming", true));

        library.addAtEnd(
                new Book("B2", "Effective Java", "Joshua Bloch",
                        "Programming", true));

        library.addAtEnd(
                new Book("B3", "The Alchemist", "Paulo Coelho",
                        "Fiction", true));

        library.addAtPosition(2,
                new Book("B4", "Atomic Habits", "James Clear",
                        "Self Help", true));

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author (Joshua Bloch):");
        library.searchByAuthor("Joshua Bloch");

        library.updateAvailability("B3", false);

        System.out.println("\nAfter Updating Availability:");
        library.displayForward();

        library.removeByBookId("B2");

        System.out.println("\nAfter Removing B2:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
