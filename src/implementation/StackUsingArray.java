package implementations;

/*
====================================================
Problem:
Implement Stack Using Array

Difficulty:
Easy

Pattern:
Stack Implementation

Data Structure:
Array

Time Complexity:
push()    -> O(1)
pop()     -> O(1)
peek()    -> O(1)
isEmpty() -> O(1)
isFull()  -> O(1)

Space Complexity:
O(n)

Key Idea:
A stack follows the LIFO (Last In, First Out) principle.
The "top" variable keeps track of the current top element.
Instead of deleting elements from the array,
we simply move the top pointer.

====================================================
*/

public class StackUsingArray {

    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public StackUsingArray(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push Operation
    public void push(int value) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = value;
    }

    // Pop Operation
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int poppedElement = arr[top];
        top--;

        return poppedElement;
    }

    // Peek Operation
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check Empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check Full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display Stack
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Driver Code
    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        stack.display();

        stack.push(40);

        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());

        System.out.println("Is Full: " + stack.isFull());
    }
}