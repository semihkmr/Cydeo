package Vesa3;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Task6 {
    /*

6) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static ArrayList<Integer> sortDescending(int[] arr){

        Set<Integer> list = new TreeSet<>();

        ArrayList<Integer> listSorted = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }


return  listSorted;
    }
}
