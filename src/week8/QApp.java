package week8;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */

// Example 27
// Queue Application using Q1 or Q2
public class QApp {

    public static void main(String[] args) {

//        Q1 q = new Q1();
        Q2 q = new Q2();

        if (q.length() == 0)
            System.out.println("The queue is empty");
        else System.out.println("The queue is not empty");

        q.add(new String("hello"));
        System.out.println("'hello' added - Q Length is: " + q.length());
        q.remove();
        System.out.println("'hello' removed - Q Length is: " + q.length());
        q.add(new Double(7.1));
        System.out.println("'7.1' added - Q Length is: " + q.length());
        q.add(new String("abc"));
        System.out.println("'abc' added - Q Length is: " + q.length());

        System.out.println("Remove: " + q.remove().toString());
        System.out.println("- Q Length is: " + q.length());
        System.out.println("Remove: " + q.remove().toString());
        System.out.println("- Q Length is: " + q.length());
        System.out.println("Remove: " + q.remove());
        System.out.println("- Q Length is: " + q.length());

        if (q.length() == 0)
            System.out.println("Queue is empty");
        else System.out.println("Queue is not empty");

        q.remove();

        if (q.length() == 0)
            System.out.println("Queue is empty");
        else System.out.println("Queue is not empty");

    }  // main method
}// QApp class
