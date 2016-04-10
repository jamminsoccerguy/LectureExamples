package week8;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */

// Example 25
// StackApp.java
// Application using Stack1 or Stack2
// Since both Stack1 and Stack2 implement the Stack interface, it makes no
// difference which implementation is used.
// Making a simple change to the variable declaration for the stack will allow
// changing between implementations
public class StackApp {

    public static void main(String[] args) {

//        Stack1 s = new Stack1();  // linked list Stack implementation
        Stack2 s = new Stack2();  // array Stack implementation

        System.out.println();
        if (s.isEmpty())
            System.out.println("The stack is empty");
        else System.out.println("The stack is not empty");

        System.out.println("Top to start is: " + s.top());  // should be null

        s.push(new String("hello"));
        s.push(new Double(7.1));
        s.push(new String("abc"));

        System.out.println("Pop: " + s.pop().toString() + ";  New top: " +
                s.top().toString());
        System.out.println("Pop: " + s.pop().toString() + ";  New top: " +
                s.top().toString());
        System.out.println("Pop: " + s.pop().toString() + ";  New top: " +
                s.top());

        System.out.println("New top: " + s.top());
        System.out.println();

    }  // main method
} // StackApp class
