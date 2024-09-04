public class Q23a {


        public static void main(String[] args) {
            int num = 1; // Starting number
            int rows = 3; // Number of rows
    
            // Outer loop for rows
            for (int i = 1; i <= rows; i++) {
                // Inner loop for printing numbers in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++; // Increment the number for next position
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }
    

