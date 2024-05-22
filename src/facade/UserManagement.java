package facade;

public class UserManagement {
    public void registerUser(String userName) {
        System.out.println("Registering user: " + userName);
    }

    public void deregisterUser(String userName) {
        System.out.println("Deregistering user: " + userName);
    }

    public void checkUserStatus(String userName) {
        System.out.println("Checking status for user: " + userName);
    }
}