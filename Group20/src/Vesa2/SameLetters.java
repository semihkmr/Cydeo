package Vesa2;

public class SameLetters {


/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */

    public static boolean isSameLetter(String str, String str2){



        if(str2.length() != str.length()){
            return false;
        }
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {

            for (int j = 0; j <str2.length() ; j++) {

                if(str.charAt(i) == str2.charAt(j)){
                    count++;
                   break;
                }

            }
            if ( count == str.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("isSameLetter(\"abc\",\"abb\") = " + isSameLetter("abc", "abb"));
        System.out.println("isSameLetter(\"abc\",\"cab\") = " + isSameLetter("abc", "cab"));
        System.out.println("isSameLetter(\"vcsa\",\"vcs\") = " + isSameLetter("vcsa", "vcs"));
    }
}
