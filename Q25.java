
    import java.util.Scanner;

public class Q25 {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Q25(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Method to add an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Unable to add element: " + element);
            return;
        }
        stack[++top] = element;
        System.out.println("Element " + element + " pushed to stack.");
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        System.out.println("Element " + stack[top] + " popped from stack.");
        return stack[top--];
    }

    // Method to check the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to display the elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the stack
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        Q25 stack = new Q25(size);

        // Menu-driven stack operations
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element is: " + topElement);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }

    }

}


