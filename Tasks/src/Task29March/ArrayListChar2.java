package Task29March;

import java.util.ArrayList;

public class ArrayListChar2 {
    public static void main(String[] args) {

        ArrayList<Character> arr = new ArrayList<>();
        char letter = 'a';
        for (int i = 0; i <26 ; i++) {
            arr.add(i,letter);
            letter++;
        }
        System.out.println(arr);
        arr.remove(Character.valueOf('a'));
        System.out.println(arr);
        arr.remove(Character.valueOf('e'));
        System.out.println(arr);
        arr.remove(Character.valueOf('i'));
        System.out.println(arr);
        arr.remove(Character.valueOf('u'));
        System.out.println(arr);
        arr.remove(Character.valueOf('o'));
        System.out.println(arr);

        int [] arr1 = new int[2];
        int arr2[] = new int[2];


    }
}
