package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class Counter {

    public static int total = 0;
    private int topValue;
    private int currentValue = 0;

    public Counter(int n) {
        topValue = n;
    }

    public int getNext() {
        total++;
        currentValue = (currentValue + 1) % topValue;
        return currentValue;
    }


    public static void main(String[] args) {
        Counter c1 = new Counter(2); //2
        Counter c2 = new Counter(3); //3
        Counter c3 = c1; //2
        System.out.println("Number of calls: " + Counter.total);
        System.out.println("Counter1 = " + c1.getNext());
        System.out.println("Counter2 = " + c2.getNext());
        System.out.println("Counter3 = " + c3.getNext());
        System.out.println("Counter1 = " + c1.getNext());
        System.out.println("Counter2 = " + c2.getNext());
        System.out.println("Counter3 = " + c3.getNext());
        System.out.println("Counter2 = " + c2.getNext());
        System.out.println("Counter3 = " + c3.getNext());
        System.out.println("Number of calls: " + Counter.total);
    } // main
}// Counter
