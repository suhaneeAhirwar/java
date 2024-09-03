
    import java.util.Scanner;

public class Q26 {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public Q26(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue Overflow! Unable to add element: " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        count++;
        System.out.println("Element " + element + " enqueued to queue.");
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No elements to dequeue.");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        count--;
        System.out.println("Element " + element + " dequeued from queue.");
        return element;
    }

    // Method to check the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    // Method to display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the queue
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();

        Q26 queue = new Q26(size);

        // Menu-driven queue operations
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element is: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
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

