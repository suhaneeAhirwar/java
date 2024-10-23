import java.io.IOException;

public class ExceptionHandlingDemo {

    // Method that declares it can throw an IOException
    public static void riskyMethod(int num) throws IOException {
        if (num == 0) {
            throw new IOException("Number cannot be zero!");  // Manually throwing an exception
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            // Example of dividing by zero - will throw ArithmeticException
            int a = 10;
            int b = 0;
            System.out.println("Result of division: " + (a / b));  // This will cause an exception

        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This is the 'finally' block. It always executes.");
        }

        System.out.println("-----");

        try {
            // Calling a method that might throw an IOException
            riskyMethod(0);
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        } finally {
            System.out.println("Executing finally block after riskyMethod");
        }

        System.out.println("-----");

        try {
            // Using 'throw' to manually throw an exception
            throw new NullPointerException("Manually thrown NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("This is the final 'finally' block.");
        }
    }
}
