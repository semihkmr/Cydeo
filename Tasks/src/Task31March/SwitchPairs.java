package Task31March;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {

    /*
    Switch Pairs
Given an ArrayList of words switch position for
each pair in the List. A pair is an element and
the element next to it.
The given ArrayList will always have an even
number of elements so each element will
always have a single pair.
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in" "the" and "hat"
Output: {"in", "Cat", "hat", "the”}
     */
    public static void main(String[] args) {

        String[] arr = {"Cat", "in", "the", "hat"}; // Cat ile in yer degistir / the hat yer degistir

        ArrayList<String> arrNew = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < arrNew.size(); i++) {
            i++;

            String str = arrNew.get(i); //  i=1 in  = i=3 hat

            arrNew.remove(i);

            arrNew.add(i - 1, str);

        }
        System.out.println(arrNew);


    }
}


