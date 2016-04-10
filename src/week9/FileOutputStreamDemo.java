package week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */
public class FileOutputStreamDemo {

    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/bhavtosh/Desktop/Bhavtosh Rath/File_IO/read_data");
        int n = fis.available();
        byte b[] = new byte[n];
        fis.read(b);

        FileOutputStream fos = new FileOutputStream("/Users/bhavtosh/Desktop/Bhavtosh Rath/File_IO/write_data");
        fos.write(b);

        fos.close();
        fis.close();

    }
}

