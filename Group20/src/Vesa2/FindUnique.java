package Vesa2;

public class FindUnique {

    /*
    4) String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String findUnique(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }}
                if(count==1){
                    result+= str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("findUnique(\"AAABBBCCCDEF\") = " + findUnique("AAABBBCCCDEF"));
    }
}
