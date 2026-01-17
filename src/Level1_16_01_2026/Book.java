package Level1_16_01_2026;

public class Book {
    private String title;
    private String author ;
    private int price;

    Book()
    {
        this.title="Atomic Habits";
        this.author="James Clear";
        this.price=300;
    }
    Book(String title,String author,int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
