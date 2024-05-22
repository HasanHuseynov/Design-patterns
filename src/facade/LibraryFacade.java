package facade;

public class LibraryFacade {
    private BookCatalog bookCatalog;
    private UserManagement userManagement;
    public LibraryFacade(BookCatalog bookCatalog, UserManagement userManagement) {
        this.bookCatalog = bookCatalog;
        this.userManagement = userManagement;
    }

    public void registerUser(String userName) {
        userManagement.registerUser(userName);
    }

    public void deregisterUser(String userName) {
        userManagement.deregisterUser(userName);
    }

    public void addBook(String bookTitle) {
        bookCatalog.addBook(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookCatalog.removeBook(bookTitle);
    }

    public void issueBook(String bookTitle, String userName) {
        userManagement.checkUserStatus(userName);
        bookCatalog.searchBook(bookTitle);
    }

}

