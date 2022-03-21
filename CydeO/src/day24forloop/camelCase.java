package day24forloop;
import java.util.Scanner;
public class camelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sentence = sc.nextLine().toLowerCase();
        String newSentence = "";

        for (int i = 0; i < sentence.length(); i++) {
             if (sentence.charAt(i) != ' ')
                newSentence += sentence.charAt(i);
            else {
                 System.out.println(i);
                newSentence += sentence.substring(i + 1, i + 2).toUpperCase();
              i++;
            }


        } System.out.println(newSentence);
    }
}




