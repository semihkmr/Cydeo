package Vesa3;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.*;

public class Task5 {
    /*
    5) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */

    // public static int[] sortWithoutSortMethod(int[] arr){

    public static ArrayList<Integer> sortAscending(int[] arr){

        Set<Integer> list = new TreeSet<>();

        for (int each : arr) {
            list.add(each);
        }

        return new ArrayList<>(list);

    }

    public static void main(String[] args) {

        int [] arr = {1,4,6,3,5,7};

        System.out.println(sortAscending(arr));
    }

        

}
