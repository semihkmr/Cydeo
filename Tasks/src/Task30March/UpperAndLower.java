package Task30March;

import java.util.ArrayList;

public class UpperAndLower {

    public static ArrayList<Character>  GetLowerCase(String str){

        ArrayList<Character> lowerCase = new ArrayList<>();

        for (int i = 0; i < str.length() ; i++) {

            if(Character.isLowerCase(str.charAt(i))){
                lowerCase.add(str.charAt(i));
            }

        }
        return lowerCase ;
    }
    public static ArrayList<Character> GetUpperCase(String str){
        ArrayList<Character> upperCase = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upperCase.add(str.charAt(i));
            }
        }
        return upperCase;
    }

    public static void main(String[] args) {
        String str="heLLoWoRlD";

        System.out.println(GetLowerCase(str));
        System.out.println(GetUpperCase(str));
    }
}
