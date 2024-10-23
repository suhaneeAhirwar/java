
    public class  assi22 {

        public static void main(String[] args) {
            try {
        
                int[] arr = new int[-5];
            } catch (NegativeArraySizeException e) {
                System.out.println("Caught a NegativeArraySizeException: " + e.getMessage());
            }

            try {

                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException: " + e.getMessage());
            }
    
            System.out.println("Program continues after handling exceptions.");
        }
    }
    
