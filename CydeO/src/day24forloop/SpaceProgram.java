package day24forloop;

import java.util.Locale;
import java.util.Scanner;
public class SpaceProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word");
        String str = sc.nextLine();
        String newWord = "";
    //  java
     // 0123
             str = str.replaceAll(" ","_").toLowerCase(Locale.ROOT);

         for(int i=0; i< str.length();i++){
             newWord+=str.charAt(i)+" ";
             // j a v a
         }

        System.out.println(newWord);



    }
}
