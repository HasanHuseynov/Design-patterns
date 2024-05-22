package facade;

public class BookCatalog {
    public void searchBook(String bookTitle) {
        System.out.println("Searching for the book: " + bookTitle);
    }

    public void addBook(String bookTitle) {
        System.out.println("Adding the book: " + bookTitle);
    }

    public void removeBook(String bookTitle) {
        System.out.println("Removing the book: " + bookTitle);
    }
}