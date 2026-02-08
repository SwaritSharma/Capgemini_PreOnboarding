package Javaeight;

import java.util.*;
import java.util.stream.*;

public class BookRecommendations {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune", "Frank Herbert", "Science Fiction", 4.8),
                new Book("Neuromancer", "William Gibson", "Science Fiction", 4.3),
                new Book("Foundation", "Asimov", "Science Fiction", 4.6),
                new Book("Random Book", "X", "Drama", 4.9)
        );

        List<BookRecommendation> page1 =
                books.stream()
                        .filter(b -> b.genre.equals("Science Fiction") && b.rating > 4.0)
                        .map(b -> new BookRecommendation(b.title, b.rating))
                        .sorted((a, b) -> Double.compare(b.rating, a.rating))
                        .limit(10)
                        .skip(0)   // page 1 (5 books per page → skip = page*5)
                        .collect(Collectors.toList());

        page1.forEach(b -> System.out.println(b.title + " " + b.rating));
    }
}

