package LinkedList.MovieManagement;

import java.time.LocalDate;

public class MovieDoubleLinkedListTest {

    public static void main(String[] args) {

        MovieDoubleLinkedList list = new MovieDoubleLinkedList();

        list.addAtBeginning(
                new Movie("Inception", "Nolan",
                        LocalDate.of(2010, 7, 16), 9.0));

        list.addAtEnd(
                new Movie("Interstellar", "Nolan",
                        LocalDate.of(2014, 11, 7), 8.8));

        list.addAtEnd(
                new Movie("Avatar", "Cameron",
                        LocalDate.of(2009, 12, 18), 7.9));

        list.addAtPosition(2,
                new Movie("The Prestige", "Nolan",
                        LocalDate.of(2006, 10, 20), 8.5));

        System.out.println("Movies Forward:");
        list.displayForward();

        System.out.println("\nMovies Reverse:");
        list.displayReverse();

        System.out.println("\nSearch by Director (Nolan):");
        list.searchByDirector("Nolan");

        System.out.println("\nSearch by Rating (7.9):");
        list.searchByRating(7.9);

        list.updateRating("Avatar", 8.2);

        System.out.println("\nAfter Updating Rating:");
        list.displayForward();

        list.removeByTitle("Interstellar");

        System.out.println("\nAfter Removing Interstellar:");
        list.displayForward();
    }
}
