
    import java.util.Scanner;
    public class Q27 {
    

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

        // Finding the smallest number in the array
        int smallest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Printing the smallest number
        System.out.println("The smallest number in the array is: " + smallest);
    }
}


