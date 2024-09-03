
    import java.util.Scanner;

public class Q30 {
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

        // Print every alternate element of the array
        System.out.println("Every alternate element of the array:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
