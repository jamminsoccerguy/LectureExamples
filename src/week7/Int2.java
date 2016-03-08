package week7;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

// Int2,java
// Second interface of two to be implemented by IntClass.java
// See also IntApp.java

public interface Int2 {

    // ALL interface variables are final and static, so we do not specify
    int MAX = 5;

    // ALL interface methods are public, so we do not specify

    // abstract method 1
    void printValue(String number);

    // abstract method 2
    void printTwice(String s);
}
