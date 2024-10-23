
    import java.util.Scanner;

// Custom exception for invalid username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom exception for password mismatch
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class  assi25{

    // Method to validate username and password
    public static void validateUser(String username, String password, String confirmPassword)
            throws InvalidUsernameException, PasswordMismatchException {
        
        // Check if the username is less than 6 characters
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }
        
        // Check if the password and confirmation password do not match
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }
        
        System.out.println("Username and password are valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            // Validate the username and password
            validateUser(username, password, confirmPassword);
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            // Handle the exceptions
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


