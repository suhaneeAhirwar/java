
    import java.util.Scanner;

public class  Qten {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        // Initialize the first two Fibonacci numbers
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Iterate through and print the Fibonacci series
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            
            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        // Close the scanner object
        scanner.close();
    }
}
