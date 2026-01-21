package FourPillars.librarysystem;

public class Book extends LibraryItem implements Reservable{
    public Book(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
