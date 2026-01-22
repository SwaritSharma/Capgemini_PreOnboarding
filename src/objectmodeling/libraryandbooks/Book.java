package objectmodeling.libraryandbooks;

public class Book {
    private String title;
    private String author;

    public Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayBookDetails()
    {
        System.out.print("Book Title: "+getTitle()+"  ");
        System.out.println("Book Author: "+getAuthor());
    }
}
