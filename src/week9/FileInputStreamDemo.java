package week9;

import java.io.IOException;
import java.io.FileInputStream;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */
public class FileInputStreamDemo {

    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("/Users/bhavtosh/Desktop/Bhavtosh Rath/File_IO/read_data");
        int n = fis.available();
        System.out.println(n);

        byte b[] = new byte[n];

        int data = fis.read(b);
        System.out.println(data);

        String s = new String(b);
        System.out.println(s);

        fis.close();
    }
}
