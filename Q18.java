import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;

        // Handle the case when the number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Convert to positive if the number is negative
            number = Math.abs(number);
            while (number > 0) {
                number /= 10;  // Remove the last digit
                count++;
            }
        }

        System.out.println("The number of digits is: " + count);
    }
}
