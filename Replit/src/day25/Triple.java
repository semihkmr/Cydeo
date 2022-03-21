package day25;
import java.util.Scanner;
public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Please enter the word");
        int endIndex = str.length();
        int count = 0;
        str += "  ";

        for (int i = 0; i < endIndex; i++) {

            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))             {

                count++;

            }
        }

        System.out.println(count);

    }
}
