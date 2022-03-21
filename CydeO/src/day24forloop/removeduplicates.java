package day24forloop;
import java.util.Scanner;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = input.nextLine().trim().toLowerCase();
        String result = "";


        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(word.charAt(i) + "")) {
                result += word.charAt(i);
            }


        }
        System.out.println(result);
    }
}
