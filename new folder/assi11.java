
    // Base class Num
class Num {
    int number;

    // Constructor to initialize the number
    public Num(int number) {
        this.number = number;
    }

    // Method to display the number
    public void showNum() {
        System.out.println("Number: " + number);
    }
}

// Derived class HexNum that inherits from Num
class HexNum extends Num {

    // Constructor to initialize the number
    public HexNum(int number) {
        super(number);
    }

    // Overriding showNum() to display number in Hexadecimal and Octal
    @Override
    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}

// Main class to demonstrate the working of Num and HexNum
public class assi11{
    public static void main(String[] args) {
        // Create an instance of the base class Num
        Num numObj = new Num(100);
        numObj.showNum(); // Display the number

        System.out.println();

        // Create an instance of the derived class HexNum
        HexNum hexNumObj = new HexNum(100);
        hexNumObj.showNum(); // Display the number in Hexadecimal and Octal
    }
}

