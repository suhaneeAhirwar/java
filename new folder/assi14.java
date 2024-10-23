
import java.util.Scanner;

class  assi14 {
    int emp_id;
    String name;
    double basic_salary;
    double gross_salary;

    // Constructor to accept employee details
    assi14(int emp_id, String name, double basic_salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.basic_salary = basic_salary;
    }

    // Method to calculate gross salary
    public void calculateGrossSalary() {
        double hra = 0.2 * basic_salary; // HRA is 20% of basic salary
        double da = 0.1 * basic_salary;  // DA is 10% of basic salary
        gross_salary = basic_salary + hra + da;
    }

    // Method to display employee details and gross salary
    public void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee details from the user
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        // Create an employee object
        assi14 emp = new assi14(emp_id, name, basic_salary);

        // Calculate gross salary
        emp.calculateGrossSalary();

        // Display employee details and gross salary
        emp.displayDetails();
    }
}
