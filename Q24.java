
    import java.util.Scanner;

public class  Q24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initializing the array
        int[] array = new int[n];

        // Taking input from the user for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculating the sum of the array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Calculating the average
        double average = (double) sum / n;

        // Printing the sum and average
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }
}

