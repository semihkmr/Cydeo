package Task31March;

import java.util.ArrayList;

public class GetUpperAndLower {
    /*
    Get Uppercase or Lowercase
Write a program that can extract the uppercase and lowercase
characters from a String and store them into separate ArrayLists of
Characters
Ex:
str = “heLLoWoRlD
list1: {h, e, o, o, l}
list2: {L, L, W, R, D}
     */

    public static ArrayList<Character> getUpper(String str){

        ArrayList<Character> UpperCase = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {

            if(Character.isUpperCase(str.charAt(i))){
                UpperCase.add(str.charAt(i));
            }
        }return UpperCase;
    }
    public static ArrayList<Character> getLower(String str){
        ArrayList<Character> LowerCase = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isLowerCase(str.charAt(i))){
                LowerCase.add(str.charAt(i));
            }
        }return LowerCase;
    }

    public static void main(String[] args) {

        String str = "heLLoWoRlD";

        System.out.println(getLower(str));
        System.out.println(getUpper(str));
    }

}
