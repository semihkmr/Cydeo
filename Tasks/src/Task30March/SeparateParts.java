package Task30March;

import java.util.ArrayList;

public class SeparateParts {

    public static ArrayList<Character> GetDigits(String str){

        ArrayList<Character> getDigits = new ArrayList<>();

        for (int i = 0; i < str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                getDigits.add(str.charAt(i));
            }
        }
        return getDigits;
    }
    public static ArrayList<Character> GetLetter(String str){

        ArrayList<Character> getLetter = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isLetter(str.charAt(i))){
                getLetter.add(str.charAt(i));
            }
        }
        return getLetter;
    }
    public static ArrayList<Character> GetSpecialChar(String str){

        ArrayList<Character> getSpecialChar = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {

            if(!Character.isLetterOrDigit(str.charAt(i))){
                getSpecialChar.add(str.charAt(i));
            }
        }
        return getSpecialChar;
    }

    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        System.out.println(GetDigits(str));
        System.out.println(GetLetter(str));
        System.out.println(GetSpecialChar(str));
    }
}
