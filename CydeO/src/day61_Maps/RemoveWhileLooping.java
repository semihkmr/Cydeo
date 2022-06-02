package day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,6,12,6,35,6,2,5,6,2,3,1,4,5));

//
//        for (int i = 0; i <list.size() ; i++) {
//
//            if(list.get(i)<5){
//                list.remove(i);
//            }
//
//        }  traditional loop with removing it does not work, because index/ elements get shifted it could skip some elements
        System.out.println(list);


        list.removeIf(integer -> integer < 5);

        System.out.println(list);



    }
}
