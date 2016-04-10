package week8;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */

// Example 27
// Queue implementation using an Array
public class Q2 implements Q {

    // constructors

    public Q2() {
        q = new Object[0];
    }

    public Q2(int initLength) {

        if (initLength < 0)
            throw new IllegalArgumentException("capacity requested is negative");
        q = new Object[initLength];
    }

    // selectors

    public void add(Object o) {

        if (size == q.length) {  // allocate bigger array
            Object[] newq = new Object[2 * q.length + 1];
            if (front <= rear)  // queue has not wrapped,
                // so make simple copy to new space
                System.arraycopy(q, front, newq, 0, size);
            else if (front > rear) {  // queue has wrapped,
                // so copy in two chunks
                System.arraycopy(q, front, newq, 0, q.length - front);
                System.arraycopy(q, 0, newq, q.length - front, rear + 1);
                front = 0;
                rear = size - 1;
            }
            q = newq;
        }  // allocate bigger array

        rear = (rear + 1) % q.length;
        q[rear] = o;
        size++;
        System.out.println("Front is: " + front + ";  Rear is: " + rear +
                ";  Size is: " + size);
    }

    public Object remove() {

        if (size == 0)
            return null;

//        System.out.println("Front is: " + front);
        Object answer = q[front];
        front = (front + 1) % q.length;
        size--;
        return answer;
    }

    public int length() {
        return size;
    }

    private Object[] q;
    private int size;
    private int front;
    private int rear;

} // Q2 class
