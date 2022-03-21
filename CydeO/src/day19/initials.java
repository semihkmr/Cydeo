package day19;
import java.util.Locale;
import java.util.Scanner;
public class initials {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=sc.next().toUpperCase(Locale.ROOT);
        System.out.println("Please enter your last name");
        String lastName = sc.next().toUpperCase(Locale.ROOT);

        char initialFirst = firstName.charAt(0);
        char initialLast = lastName.charAt(0);
        System.out.println(initialFirst+""+initialLast);
    }
}
