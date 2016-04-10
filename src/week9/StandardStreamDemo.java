package week9;

import java.io.IOException;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */
public class StandardStreamDemo {

    public static void main(String args[]){
        try {
            byte b[] = new byte[10];
            System.out.println("Enter any number:");
            System.in.read(b);
            System.err.print("error message");
        }
        catch(IOException e)
        {
            System.err.print(e);
        }
    }
}
