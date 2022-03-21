package day20;
import java.util.Scanner;
public class MoveFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter sentence");

        String sentence = sc.nextLine();
         int length = sentence.length();
        int whereFirstSpace = sentence.indexOf(" ");
         String firstWord = sentence.substring(0,whereFirstSpace);
         String sentenceWithourFirstWord = sentence.substring(whereFirstSpace+1,length);
        String  newSentence = ""+ sentenceWithourFirstWord + " " +firstWord;
        System.out.println(newSentence);


    }
}
