package day29;
import java.util.Arrays;

public class last {
    public static void main(String[] args) {

        String str= "Happy Birthday Daniela";

        String [] words = str.split(" ");


        String reversedMiddle="";
        char [] middleWord = words[1].toCharArray();
        System.out.println(Arrays.toString(middleWord));
        for (int i = words[1].length()-1; i >0 ; i--) {

            reversedMiddle+= words[1].charAt(i);


        }
        System.out.println(reversedMiddle);
    }
}
