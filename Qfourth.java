
    import java.util.Scanner;

public class Qfourth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Swap the numbers
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        scanner. close();
    }
}
