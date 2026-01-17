package Level1_16_01_2026;

public class LibraryBook {
    private  String title;
    private String author;
    private int price;
    private int availability;

    LibraryBook(String title,String author,int price,int availability)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    LibraryBook(LibraryBook book)
    {
        this.title=book.title;
        this.author=book.author;
        this.price=book.price;
        this.availability=book.availability;
    }

    public void borrow()
    {
        if(availability<=0)
        {
            System.out.println("Book not Available");
        }
        else{
            availability--;
            System.out.println("Book Borrowed");
        }
    }
    public int getAvailability()
    {
        return availability;
    }
}
