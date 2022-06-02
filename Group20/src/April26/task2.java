package April26;


public class task2 {
    /*
    14. Write a Java program to compare a given string to another string, ignoring case considerations. Go to the editor

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false
"Stephen Edwin King" equals "stephen edwin king"? true
     */
    public static boolean checkSentence(String str,String str2){

        if(str.equalsIgnoreCase(str2)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        System.out.println(str2.substring(3,3));



        System.out.println(checkSentence(str,str2));
    }

}
