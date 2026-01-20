package inheritance.single.librarymanagement;

public class Author extends Book{
    private String name;
    private String bio;
    public Author(String title,int publicationYear,String name,String bio)
    {
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author Name: "+name );
        System.out.println("Bio: "+bio);
    }
}
