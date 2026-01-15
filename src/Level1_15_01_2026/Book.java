package Level1_15_01_2026;

class Book {

    String title;
    String author;
    double price;

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book b = new Book();
        b.title = "Java Basics";
        b.author = "James";
        b.price = 499;

        b.displayBookDetails();
    }
}
