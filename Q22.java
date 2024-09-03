import java.util.Arrays;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Initialize the array
        double[] numbers = new double[size];

        // Input: Elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array to find the median
        Arrays.sort(numbers);

        // Find the median
        double median;
        if (size % 2 == 0) {
            // Even number of elements: median is the average of the two middle elements
            median = (numbers[size / 2 - 1] + numbers[size / 2]) / 2.0;
        } else {
            // Odd number of elements: median is the middle element
            median = numbers[size / 2];
        }

        // Output the median
        System.out.println("The median is: " + median);
    }
}

