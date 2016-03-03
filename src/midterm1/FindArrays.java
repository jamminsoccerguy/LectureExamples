package midterm1;

/**
 * Created by Mike Plucker
 * Date: 3/2/2016
 * Class: CSCI 1933-12
 */
public class FindArrays {

    public static int find(int[] pattern, int[] message){

        int index = 0;
        boolean flag = false;

        int arrayIndex = 0;

        for(int i = 0; i < message.length; i++){

            index = message[i];

            for(int j = 0; j < pattern.length; j++){

                if (pattern[j] == message[index]){
                    arrayIndex = index;
                    flag = true;
                }

            }


        }

        if(flag){
            return message[arrayIndex];
        }
        else
            return -1;
    }


    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3};

        System.out.println(FindArrays.find(array2, array1));

    }
}
