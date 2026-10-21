package Stack;

import java.util.Scanner;

public class StackUsingArray { // insert at end and remove from end
    private final int[] arr;
    private final int capacity;
    private int top;

    public StackUsingArray(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed onto stack");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top--] + " popped from stack");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(arr[top] + " is the top element");
    }

    public void size() {
        System.out.println("Current size of stack: " + (top + 1));
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack capacity: ");
        int size = sc.nextInt();
        StackUsingArray stack = new StackUsingArray(size);

        while (true) {
            System.out.println("\n📘 MENU 📘");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Is Empty");
            System.out.println("6. Display Stack");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.size();
                    break;
                case 5:
                    System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
                    break;
                case 6:
                    stack.display();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
