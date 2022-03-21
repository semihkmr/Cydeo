package day25;
import java.util.Scanner;
public class howmany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word");
        String str = sc.nextLine();
        String checked = "";
        for (int i = 0; i < str.length(); i++) {


            char letter = str.charAt(i);
            int count = 0;
            if (!checked.contains("" + letter)) {
                for (int j = 0; j < str.length(); j++) {

                    char eachletter = str.charAt(j);
                    if (letter == eachletter) {
                        count++;
                    }
                }
                System.out.println(letter + " - " + count);
                checked += letter;
            }

        }
    }
}