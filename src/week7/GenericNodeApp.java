package week7;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

// GenericNodeApp.java

// Driver Application for the GenericNode class
// Includes two examples--list of Doubles (using wrapper class) and
//                      --list of Data Records (see Record.java)

public class GenericNodeApp {

    public static void main(String[] args) {

        // list made from GenericNode of Doubles
        GenericNode<Double> start = new GenericNode<Double> (new Double(0), null);

        for (int i = 1; i <= 5; i++) {
            start.addInOrder2(new GenericNode<Double> ((double) i, null), start);
        }

        System.out.println("\nUsing non-static print from header:");
        start.printFrom();


        /*// re-set and try with a data record
        // list made from GenericNode of Record (see Warning before last item added to list)
        GenericNode<Record> start2 = new GenericNode<Record> (new Record(), null);

        start2.addInOrder2 (new GenericNode<Record> (new Record("John", "A", "Doe"), null),
                start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("John", "C", "Doe"), null),
                start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("John", "B", "Doe"), null),
                start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("Mary", "A", "Doe"), null),
                start2);
        start2.addInOrder2 (new GenericNode<Record> (new Record("Ann", "A", "Apple"), null),
                start2);

        // Note:  When comparing with the previous NewNodeApp.java, you will see that the
        // line that followed in NewNodeApp.java is not here.
        // This is because the list referenced by start2 expects GenericNode<Record>,
        // so sending in GenericNode<Integer> is a type mismatch and does not work.
        // It was O.K. in NewNode because the data were all Objects.  Generics are
        // not as "generic" as Objects, but the methods will return data of type <T>
        // rather than Object which is more desirable.

        // I short, mixing GenericNodes with different basetypes is not a reasonable approach

        System.out.println("\nUsing non-static print from header:");
        start2.printFrom();*/

    }
} // GenericNodeApp
