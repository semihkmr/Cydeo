package day05_variables;

import java.util.Scanner;

public class StringandChar {

    public static void main(String[] args) {
        // vars
        String name = "Porter";
        int age = 17;
        char desiredGrade = 'A';
        boolean senior = true;
        double pi = 3.14;
// Difference between Char and String, when you assign String you need to use double quote, but while you using char you need to use single quote!!! And olsa with Char you can assing single letter etc.
        // used to retrieve keyboard input
        Scanner scnnr = new Scanner(System.in);

        // status disp
        System.out.println(name + " Status\n" + "AGE: " + age + "\nDESIRED GRADE: " + desiredGrade + "\nIS SENIOR?: " + senior + "\nPI: " + pi);

        System.out.println("Your name, please.");
        String userName = scnnr.nextLine();
        System.out.println("Hello, " + userName + ".");

        // values given as expression of ints return as ints (no decimals; doesn't round though)
        System.out.println(" 4 * 5 / 6 is " + 4.0 * 5.0 / 6.0);

        System.out.println("Type in a number.");
        String n1 = scnnr.nextLine();
        System.out.println("Type in another number.");
        String n2 = scnnr.nextLine();

        int n1C = Integer.parseInt(n1);
        int n2C = Integer.parseInt(n2);

        System.out.println("The result is " + (n1C + n2C));
    }
}