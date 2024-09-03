
    import java.util.Scanner;

public class Q28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Input: Elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of all odd numbers in the array
        int sumOfOddNumbers = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                sumOfOddNumbers += array[i];
            }
        }

        // Output the sum of all odd numbers
        System.out.println("The sum of all odd numbers in the array is: " + sumOfOddNumbers);
    }
}
