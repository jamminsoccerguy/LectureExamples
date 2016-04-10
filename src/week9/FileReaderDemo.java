package week9;

import java.io.*;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */
public class FileReaderDemo {

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("/Users/bhavtosh/Desktop/Bhavtosh Rath/File_IO/read_data");
        BufferedReader br = new BufferedReader(fr);
        String s;

        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}
