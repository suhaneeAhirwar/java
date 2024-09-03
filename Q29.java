
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q29 {
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

        // Find duplicates and their frequencies
        findDuplicatesAndFrequency(array);
    }

    // Function to find and print duplicates and their frequencies
    public static void findDuplicatesAndFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Print the duplicates and their frequencies
        System.out.println("Duplicate elements and their frequencies:");
        boolean hasDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}

