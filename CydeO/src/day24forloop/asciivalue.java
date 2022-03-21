package day24forloop;
import java.util.Scanner;
public class asciivalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();
        char letter;
        int ascii;
        for(int i=0; i < word.length();i++){
           letter = word.charAt(i);
           ascii = letter;
            System.out.print(ascii+"\t");
        }


    }
}
