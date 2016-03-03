package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class Exam {

    public static void update(double multiplier, double val, Pair pr) {
        val = multiplier * val;
        pr.left = multiplier * pr.left;
        pr.right = multiplier * pr.right;
        System.out.println("Update: val is: " + val + " pair is: " + pr.left + " " + pr.right);
    } // update

    public static void main(String[] args) {
        Pair p = new Pair(3.0, 4.0);
        double x = 5.0;

        Pair p1 = new Pair(1.0, 2.0);
        Pair p2 = new Pair(1.0, 2.0);

        if(p1.equals(p2))
            System.out.println("They are equal.");
        else
            System.out.println("They are different.");

        if(p1 == p2)
            System.out.println("They are equal.");
        else
            System.out.println("They are different.");

        System.out.println("Start main: x is: " + x + " pair is: " + p.left + " " + p.right);
        update(2, x, p);
        System.out.println("End main: x is: " + x + " pair is: " + p.left + " " + p.right);

        x = 3.14;
        double y = (int)x;

        System.out.println(y);
        System.out.println(x);


    } // main
}
