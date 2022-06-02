package day60_Collections;

import java.util.*;

public class SetVsList {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("list.get(0) = " + list.get(0));



        Set<Integer> set = new HashSet<>();

        set.add(4);
        set.add(10); // Set does not allow  us to have duplicate
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10); //
        set.add(4);  //
       // set.add(3);
       // set.add(6);
        System.out.println(set); // Randomly printing
        //System.out.println("list.get(0) = " + set.get(0));  since the Set interface does not have a index, we can not access the elmenent
        // with this way!!


        for(int each: set){
            System.out.println(each);
        }

        // sort my HashSet
        System.out.println(new TreeSet<>(set));

        // convert list to LinkedHastSet
        System.out.println(new LinkedHashSet<>(list));

        // convert list to Hashset
        System.out.println(new HashSet<>(list)); // we are able to do this since there is an IS-A relationship


        System.out.println(new HashSet<>(Arrays.asList(1,5,2,1,4,2,5,1)));


        String str = "aaaabbbbccccbbbbdddakf";

        System.out.println(new HashSet<>(Arrays.asList(str.split(""))));
        System.out.println(new HashSet<>(Arrays.asList(str.split(""))).toString().replace(", ", "")
                .replace("[","")
                .replace("]","")); // even though it looks like ascending order, it is just a coincidence. Do not forget that HashSet is random order

    }
}
