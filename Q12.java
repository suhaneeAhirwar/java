
    import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Mathematics
        System.out.print("Enter the marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter the marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        int math = scanner.nextInt();

        // Condition check for eligibility
        boolean eligible = false;

        // Condition 1: Physics >= 50
        if (physics >= 50) {
            // Condition 2: Chemistry >= 40 or Math >= 60
            if (chemistry >= 40 || math >= 60) {
                // Condition 3: Total marks of Physics, Chemistry, and Math >= 200
                if (physics + chemistry + math >= 200) {
                    eligible = true;
                }
                // OR Condition 4: Total marks of Physics and Math >= 150
                else if (physics + math >= 150) {
                    eligible = true;
                }
            }
        }

        // Output the eligibility result
        if (eligible) {
            System.out.println("The student is eligible for admission.");
        } else {
            System.out.println("The student is not eligible for admission.");
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}

