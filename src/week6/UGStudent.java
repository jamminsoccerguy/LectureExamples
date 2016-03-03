package week6;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */

// UGStudent.java
// Simple Inheritance class
public class UGStudent extends Student {

    public UGStudent() {};

    public UGStudent(String yr, double grades) {
        year = yr;
        gpa = grades;
    }

    public String year;
    public double gpa;
}
