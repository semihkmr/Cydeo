package Task5AprilMemet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthElement {

    public static int getBiggestElement(ArrayList<Integer> list,int n){
        ArrayList<Integer> removeDuplicate = new ArrayList<>();

        for (int each:list){
            if(!removeDuplicate.contains(each)){
                removeDuplicate.add(each);
            }
        }
        Collections.sort(removeDuplicate);
       return removeDuplicate.get(removeDuplicate.size()-n);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        System.out.println(getBiggestElement(list,5));
    }
}


