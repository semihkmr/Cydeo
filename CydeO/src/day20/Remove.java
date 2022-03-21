package day20;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter two  words");
        String word = sc.nextLine();
          int length = word.length();
         int whereIndex = word.lastIndexOf(" ");
         String newWord1 = word.substring(1,whereIndex);
        System.out.println(newWord1);
        String newWord2 = word.substring(whereIndex+1,length-1);
        System.out.println(newWord2);
    }
}
