package day59_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {


    public static void main(String[] args){


        List<String> list = new ArrayList<>(); // reference of the interface List , but object is ArrayList object

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add(null);
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list = " + list);
        // implementation of add method is here, adding at the last

        // we are allowed to add duplicates and allowed to add null !

         // benefit of the ArrayList is we can access the element

        List<String> list2 = new LinkedList<>(); // reference of the interface List, but the object is LinkedList
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("a");
        list2.add(null);
        System.out.println("list2.get(3) = " + list2.get(3));
        System.out.println("list2 = " + list2);


        List<String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("a");
        list3.add(null);
        System.out.println("list3.get(3) = " + list3.get(3));
        System.out.println("list3 = " + list3);


    }
}
