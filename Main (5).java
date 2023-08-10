import java.util.*;
class Stack
{
    Node top;
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    Stack() 
    {
        top = null;
    }

    void push(int d) 
    {
        Node newNode = new Node(d);
        if (top == null) 
        {
            top = newNode;
        } 
        else 
        {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Pushed element: " + d);
    }

    void pop()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Popped element: " + top.data);
            top = top.next;
        }
    }

    void peek()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
        } 
        else 
        {
            System.out.println("Top element: " + top.data);
        }
    }

    void traversal() 
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
        } else
        {
            Node current = top;
            System.out.print("Stack elements: ");
            while (current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
class Main {
    static Stack stack;

    public static void main(String[] args) {
        //System.out.print("Enter the maximum size of the stack: ");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        stack = new Stack();

        while (true) {
            System.out.println(" ");
            System.out.println("========= Stack Operations ========");
            System.out.println("1. Push");
            System.out.println("2. Traversal");
            System.out.println("3. Peek");
            System.out.println("4. Pop");
            System.out.println("5. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.traversal();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.pop();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}