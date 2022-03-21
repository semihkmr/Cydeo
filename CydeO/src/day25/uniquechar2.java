package day25;
import java.util.Scanner;
public class uniquechar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String unique = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                if (!unique.contains(str.charAt(i) + "")) {
                    unique += str.charAt(i) + " ";
                }
            }

        }System.out.println(unique);
    }
}