package objectmodeling.libraryandbooks;

import java.util.ArrayList;

public class Library {
    private String name;
    ArrayList<Book>library;

    public Library(String name)
    {
        library=new ArrayList<>();
        this.name=name;
    }

    public void addBook(Book book)
    {
        library.add(book);
    }
    public void removeBook(Book book)
    {
        library.remove(book);
    }

    public void displayBooks()
    {
        for(Book b:library)
        {
            b.displayBookDetails();
        }
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
