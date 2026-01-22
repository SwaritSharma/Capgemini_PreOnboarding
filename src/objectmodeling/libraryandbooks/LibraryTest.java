package objectmodeling.libraryandbooks;

public class LibraryTest {
    static void main() {
        Library lib1=new Library("First Lib");
        Library lib2=new Library("Second Lib");

        Book b1=new Book("Atomic Habits","James Clear");
        Book b2=new Book("Physics","HC Verma");
        Book b3=new Book("ABC","DEF");
        Book b4=new Book("FGH","JOK");

        lib1.addBook(b1);
        lib1.addBook(b4);

        lib2.addBook(b2);
        lib2.addBook(b3);

        System.out.println("Books of "+lib1.getName());
        lib1.displayBooks();

        System.out.println("Books of "+lib2.getName());
        lib2.displayBooks();

    }
}
