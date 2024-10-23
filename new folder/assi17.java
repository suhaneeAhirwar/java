
    import java.util.Scanner;

public class  assi17 {

    // Method to find the sum of consecutive digit pairs
    public static int sumOfConsecutivePairs(int number) {
        String numStr = Integer.toString(number);  // Convert the number to a string
        int sum = 0;

        // Loop through the string and take consecutive pairs
        for (int i = 0; i < numStr.length() - 1; i++) {
            // Take two consecutive digits and form a number
            String pairStr = numStr.substring(i, i + 2); 
            int pairNum = Integer.parseInt(pairStr); // Convert the pair back to an integer
            sum += pairNum;  // Add the pair number to the sum
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of consecutive pairs
        int result = sumOfConsecutivePairs(number);

        // Output the result
        System.out.println("Sum of numbers formed by consecutive digits: " + result);
    }
}
