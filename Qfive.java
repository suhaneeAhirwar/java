
    import java.util.Scanner;

public class Qfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in miles:");
        double miles = sc.nextDouble();
        
        // Conversion factor: 1 mile = 1.60934 kilometers
        double kilometers = miles * 1.60934;
        
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}

