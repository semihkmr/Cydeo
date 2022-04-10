package Task30March;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {

    public static ArrayList<String> FourOrLess(ArrayList<String> arr){

        ArrayList<String>  FourOrLessWord = new ArrayList<>();

        for (int i = 0; i < arr.size() ; i++) {

            String str = arr.get(i);
            if(str.length()<=4){
                FourOrLessWord.add(str);
            }
        } return FourOrLessWord;
    }

    public static void main(String[] args) {

        String[] arrString = {"apple","tree","loop","cat","animal","shortcut"};

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(arrString));
        System.out.println(FourOrLess(arr));
    }
}
