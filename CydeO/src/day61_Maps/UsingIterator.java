package day61_Maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();

        name.add("james");
        name.add("emre");
        name.add("bruce");
        System.out.println(name);

        Iterator<String> it = name.iterator();
        System.out.println(it.next()); // it will move the pin and return the element
        System.out.println(it.next());
        System.out.println(it.next());
     //   System.out.println(it.next()); There is no 4th element exceptions error


    }
}
