public class  Q23b {

    public static void main(String[] args) {
        int rows = 4; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // First inner loop for printing decreasing part of the pattern
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Second inner loop for printing increasing part of the pattern
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
