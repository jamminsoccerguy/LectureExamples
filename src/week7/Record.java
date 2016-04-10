package week7;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */

// Record.java
// Sample Record data class for use with Linked List NewNodeApp.java example
// Also used for GenericNodeApp.java example
public class Record {

    public Record() {};

    public Record(String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
    }

    // selectors

    public String getFirst() { return first; }

    public String getMiddle() { return middle; }

    public String getLast() { return last; }

    // methods

    public String toString() {
        return (last + ", " + first + ' ' + middle);
    }

    // instance variables

    private String first;
    private String middle;
    private String last;
}// Record
