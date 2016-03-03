package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class SquareIterate {


    private int iterate = 0;
    private int count = 1;

    public SquareIterate(){}

    public int getNext(){

        for(int i = 1; i <= count; i++){
                iterate = i*i;
        }

        count ++;

        return iterate;
    }


    public static void main(String[] args) {

        SquareIterate square = new SquareIterate();

        System.out.println(square.getNext());
        System.out.println(square.getNext());
        System.out.println(square.getNext());
        System.out.println(square.getNext());
        System.out.println(square.getNext());
        System.out.println(square.getNext());
        System.out.println(square.getNext());
        System.out.println(square.getNext());
    }
}
