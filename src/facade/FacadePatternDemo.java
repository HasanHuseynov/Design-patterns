package facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        UserManagement userManagement = new UserManagement();

        LibraryFacade libraryFacade = new LibraryFacade(bookCatalog, userManagement);

        libraryFacade.registerUser("John Doe");
        libraryFacade.addBook("The Great Gatsby");
        libraryFacade.issueBook("The Great Gatsby", "John Doe");
        libraryFacade.deregisterUser("John Doe");
    }
}
