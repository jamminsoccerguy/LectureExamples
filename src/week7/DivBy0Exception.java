package week7;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

// DivBy0Excpetion.java
// Implementation of new Exception
public class DivBy0Exception extends ArithmeticException{

    public DivBy0Exception () {

        super("Division by zero");
    }

    public DivBy0Exception (String s) {

        super(s);
    }
}// DivBy0Exception class
