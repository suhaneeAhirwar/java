
    class assi16{
        int emp_id;
        String name;
        double basic_salary;
    
        // Static variable to keep track of the number of employees
        static int employeeCount = 0;
    
        // Constructor
     assi16(int emp_id, String name, double basic_salary) {
            this.emp_id = emp_id;
            this.name = name;
            this.basic_salary = basic_salary;
            employeeCount++; // Increment employee count whenever an Employee object is created
        }
    
        // Static method to display the total number of employees
        public static void displayEmployeeCount() {
            System.out.println("Total number of employees: " + employeeCount);
        }
    
        // Instance method to display employee details
        public void displayDetails() {
            System.out.println("Employee ID: " + emp_id);
            System.out.println("Employee Name: " + name);
            System.out.println("Basic Salary: " + basic_salary);
        }
    
        public static void main(String[] args) {
            // Creating employee objects
         assi16 emp1 = new assi16(101, "Alice", 50000);
            assi16 emp2 = new  assi16(102, "Bob", 60000);
    
            // Displaying employee details
            emp1.displayDetails();
            emp2.displayDetails();
    
            // Displaying the total number of employees using the static method
           assi16.displayEmployeeCount(); // Accessed without creating an object
        }
    }
