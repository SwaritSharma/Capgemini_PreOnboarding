package inheritance.single.librarymanagement;

public class Book {
    protected String title;
    protected int publicationYear;

   public Book(String title,int publicationYear)
    {
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public void displayDetails()
    {
        System.out.println("Book Title: "+title);
        System.out.println("Book Publication Year: "+publicationYear);
    }
}
