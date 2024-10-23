
#include<iostream>
using namespace std;

class MyQueue {
    int *arr;
    int front;
    int rear;
    int size;

public:
    // Constructor to initialize the queue
    MyQueue(int size) {
        this->size = size;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    // Function to add an element to the queue
    void push(int ele) {
        if (rear == size) {
            cout << "Queue is full\n";
        } else {
            arr[rear] = ele;
            rear++;
        }
    }

    // Function to remove an element from the queue
    int dqueue() {
        if (front == rear) {
            cout << "Queue is empty\n";
            return -1;
        } else {
            int ans = arr[front];
            arr[front] = -1; // Optional step to mark as dequeued
            front++;
            // Reset the queue if it becomes empty
            if (front == rear) {
                front = 0;
                rear = 0;
            }
            return ans;
        }
    }

    // Function to get the front element of the queue
    int font() {
        if (front == rear) {
            cout << "Queue is empty\n";
            return -1;
        } else {
            return arr[front];
        }
    }

    // Function to check if the queue is empty
    bool isEmpty() {
        return (front == rear);
    }
};
int main() {
    MyQueue q(5);

    q.push(5);
    q.push(8);
    q.push(4);

    cout << "Front of queue: " << q.font() << endl;

    q.dqueue();

    cout << "Front of queue after dequeue: " << q.font() << endl;

    if (q.isEmpty()) {
        cout << "Queue is empty\n";
    } else {
        cout << "Queue is not empty\n";
    }

    return 0;
}