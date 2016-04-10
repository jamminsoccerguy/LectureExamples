package week9;

import java.io.*;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */
public class FileWriterDemo {

    public static void main(String args[]) throws Exception {
        String s = "This is CSci 1933 class.";

        char charArray[] = new char[s.length()];
        s.getChars(0, s.length(), charArray, 0);

        /** Writing data character-by-character */
//        FileWriter f0 = new FileWriter("file1.txt");
//        for (int i=0; i < charArray.length; i += 1) {
//            f0.write(charArray[i]);
//        }
//        f0.close();

        /** Writing data at a time */
        FileWriter f1 = new FileWriter("file2.txt");
        f1.write(charArray);
        f1.close();
    }
}
