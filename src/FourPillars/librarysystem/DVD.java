package FourPillars.librarysystem;

public class DVD extends LibraryItem implements Reservable{
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
