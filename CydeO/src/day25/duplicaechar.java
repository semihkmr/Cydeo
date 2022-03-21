package day25;
import java.util.Scanner;
public class duplicaechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String duplicate="";
        String checked="";
        boolean isDuplicate=false;
        for (int i = 0; i <str.length() ; i++) {
            isDuplicate = false;

            checked = str.substring(0, i) + str.substring(i + 1, str.length());
            if (checked.contains(str.charAt(i) + "")) {
                isDuplicate = true;
            }
            if (isDuplicate) {
                if (!duplicate.contains("" + str.charAt(i))) {
                    duplicate += "" + str.charAt(i);
                }

            }
        }
        System.out.println(duplicate);
    }
}
