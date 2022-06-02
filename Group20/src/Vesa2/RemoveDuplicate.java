package Vesa2;

public class RemoveDuplicate {

    /*
    Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicate(String str){

        String result = "";
        //String[] arr = str.split("");

        for (int i = 0; i <str.length() ; i++) {

            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }

        }
        return  result;

    }

    public static void main(String[] args) {

        System.out.println("removeDuplicate(\"AAABBBCCD\") = " + removeDuplicate("AAABBBCCDD"));
    }
}
