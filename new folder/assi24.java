
    // Define custom exception for TooOlder
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

// Define custom exception for TooYounger
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class assi24 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            // Input candidate's name
            System.out.print("Enter candidate's name: ");
            String name = scanner.nextLine();

            // Input candidate's age
            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();

            // Check if candidate is too old
            if (age > 45) {
                throw new TooOlder("Candidate is too old for recruitment: Age " + age);
            }

            // Check if candidate is too young
            if (age < 20) {
                throw new TooYounger("Candidate is too young for recruitment: Age " + age);
            }

            // If age is valid, print the candidate's name
            System.out.println("Candidate " + name + " is eligible for recruitment.");

        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the age.");
        } finally {
            scanner.close();
        }
    }
}
