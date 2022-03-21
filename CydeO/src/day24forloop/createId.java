package day24forloop;

import java.util.Locale;
import java.util.Scanner;
public class createId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name");
        String lastName = sc.nextLine();
        String idName = firstName.charAt(0)+lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1,3);
        int idLenght = idName.length();

        String id=idName+idLenght*2;
        System.out.println(id);

    }
}
