package replitArrays;
import java.util.Arrays;
import java.util.Scanner;
public class firstlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()};

        String letters="";
        for (int i = 0; i < words.length ; i++) {
              letters+="\n";
            for (int j = 0; j <words[i].length() ; j++) {

                letters+= words[i].charAt(0);
                letters+= words[i].charAt(words[i].length()-1);
                break;

            }

        }
        System.out.println(letters);

    }
}
