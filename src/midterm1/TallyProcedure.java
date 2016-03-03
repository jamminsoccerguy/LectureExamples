package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class TallyProcedure {

    public static int tally(int [][] a){

        int sum = 0;

        for(int i = 0; i < a.length; i++){
            int colSum = 0;

            for(int j = 0; j < a[i].length; j++){
                colSum += a[i][j];
            }
            if(colSum > sum){
                sum = colSum;
            }
        }

        return sum;
    }


    public static void main(String[] args) {

        int [][] array = new int[3][5];

        //populate array with elements

        System.out.println(TallyProcedure.tally(array));

    }

}
