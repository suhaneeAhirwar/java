
    class  assi19 {

        // Method that can throw an exception
        public static void divide(int a, int b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            } else {
                System.out.println("Result: " + (a / b));
            }
        }
    
        public static void main(String[] args) {
            try {
                // Handling division by zero
                divide(10, 0);
            } catch (ArithmeticException e) {
                System.out.println("Caught exception: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed.");
            }
    
            try {
                // Normal division
                divide(10, 2);
            } catch (ArithmeticException e) {
                System.out.println("Caught exception: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed.");
            }
        }
    }
    
