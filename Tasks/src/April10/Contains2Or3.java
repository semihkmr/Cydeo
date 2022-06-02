package April10;

import java.lang.reflect.Array;

public class Contains2Or3 {

    public static void main(String[] args) {

       int arr [] = {1,2,3,4,5};

        System.out.println(has2Or3(arr));


    }
    public static boolean has2Or3(int[] arr){

        for(int each:arr){
            if(each==2||each==3){
                return true;
            }
        }
        return false;
    }
}
