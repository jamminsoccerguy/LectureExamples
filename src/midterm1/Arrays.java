package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class Arrays {


    public static int top2(int[]a){

        int sum = 0;
        int large1 = 0;
        int large2 = 0;

        for(int i = 0; i < a.length; i++){

//            if(a[i] > large1){
//                large1 = a[i];
//            }
//            if(large1 > large2){
//                large2 = large1;
//            }

            //correct code
            if(large1 < a[i]){
                large2 = large1;
                large1 = a[i];
            }
            else if(large2 < a[i]){
                large2 = a[i];
            }

        }
        sum = large1 + large2;

        return sum;
    }

    public static void main(String[] args) {

        int [] array = {300, 750, 100, 420, 50, 20};

        System.out.println(Arrays.top2(array));

    }
}
