
    public class  assi20 {
        public static void main(String[] args) {
            try {
                // Case 1: Generate NegativeArraySizeException
                System.out.println("Generating NegativeArraySizeException...");
                int[] arr = new int[-5];  // Negative size for the array
    
            } catch (NegativeArraySizeException e) {
                System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
            }
    
            try {
                // Case 2: Generate ArithmeticException
                System.out.println("Generating ArithmeticException...");
                int result = 10 / 0;  // Division by zero
    
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
        }
    }

