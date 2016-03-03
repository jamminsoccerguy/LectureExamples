package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class Shots {

    public static int countShots(int[][] board){

        int sum = 0;

        for(int i = 0; i < board.length; i++){ //iterates over rows
            for (int j = 0; j < board[i].length; i++){ //iterates over columns
                if(board[i][j] > 0){ //if element is greater than zero
                    sum += board[i][j]; //add to sum
                }
            }
        }

        return sum;
    }



    public static void main(String[] args) {

        int [][] array = new int[2][2];

        //populate array
        //array[0][0] = 2;
        //array[0][1] = 2;
        //array[1][0] = 2;
        //array[1][1] = 2;

        /*for(int i = 0; i < array.length; i++){ //iterates over rows
            for (int j = 0; j < array[i].length; i++){ //iterates over columns
                if(array[i][j] > 0){ //if element is greater than zero
                    array[i][j] = 2;
                }
            }
        }*/


        System.out.println(Shots.countShots(array));

    }

}
