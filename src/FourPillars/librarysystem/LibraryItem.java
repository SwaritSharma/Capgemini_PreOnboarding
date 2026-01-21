package FourPillars.librarysystem;

public abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }


    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    protected void setBorrower(String name) {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract int getLoanDuration();
}
