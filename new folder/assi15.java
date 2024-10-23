
    import java.util.Scanner;

class assi15{
    int emp_id;
    String name;
    double basic_salary;
    
    // Constructor using this to distinguish between instance variables and parameters
    assi15(int emp_id, String name, double basic_salary) {
        this.emp_id = emp_id;         // this.emp_id refers to the instance variable
        this.name = name;             // this.name refers to the instance variable
        this.basic_salary = basic_salary; // this.basic_salary refers to the instance variable
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + this.emp_id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.basic_salary);
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
        assi15 emp = new assi15(emp_id, name, basic_salary);

        // Display employee details using displayDetails method
        emp.displayDetails();
    }
}
