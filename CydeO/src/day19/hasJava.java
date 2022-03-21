package day19;
import java.util.Scanner;
public class hasJava {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int length = word.length();
         String word1 = word.substring(0,(length-(length-4)));
        String word2 = word.substring(1,(length-(length-5)));

        boolean hasJava = word1.equals("java")||word2.equals("java");
        System.out.println(hasJava);
        System.out.println(word1);
        System.out.println(word2);
word.startsWith("semih");
    }
}
