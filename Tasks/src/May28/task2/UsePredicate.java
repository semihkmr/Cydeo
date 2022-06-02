package May28.task2;

import java.util.*;
import java.util.function.Predicate;

public class UsePredicate {

    public static void main(String[] args) {



    Predicate<Integer> isContainDuplicateDigit = a -> {

        ArrayList<Integer> arr = new ArrayList<>();

        String numbers = Integer.toString(a);
        String[] strArr = numbers.split("");

        int size = strArr.length;

        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(strArr));

        int sizeOfHashSet = hashSet.size();

        return !(size == sizeOfHashSet);
    };

        System.out.println(isContainDuplicateDigit.test(21414131));
        System.out.println(isContainDuplicateDigit.test(1234));

    }
}
