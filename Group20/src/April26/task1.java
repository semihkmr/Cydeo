package April26;

public class task1 {
    /*
    7. Write a Java program to concatenate a given string to the end of another string. Go to the editor

Sample Output:

String 1: PHP Exercises and
String 2: Python Exercises
The concatenated string: PHP Exercises and Python Exercises
     */
    public static String concatenate(String str,String str2){
        return str+str2;
    }

    public static void main(String[] args) {
        String str = "PHP Exercises and";
        String str2 = "Python Exercises";

        System.out.println(concatenate(str,str2));



    }

}
