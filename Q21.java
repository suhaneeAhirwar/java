
    import java.util.Scanner;

public class  Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert binary to decimal
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("The decimal equivalent of binary " + binaryNumber + " is: " + decimalNumber);

        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int decimalInput = scanner.nextInt();
        String binaryEquivalent = decimalToBinary(decimalInput);
        System.out.println("The binary equivalent of decimal " + decimalInput + " is: " + binaryEquivalent);
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binaryNumber) {
        int decimalValue = 0;
        int base = 1;  // 2^0

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                decimalValue += base;
            }
            base *= 2;  // Move to the next power of 2
        }

        return decimalValue;
    }

    // Function to convert decimal to binary
    public static String decimalToBinary(int decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder();

        while (decimalNumber > 0) {
            binaryNumber.insert(0, decimalNumber % 2);  // Prepend remainder
            decimalNumber /= 2;  // Reduce the number
        }

        return binaryNumber.toString();
    }
}
