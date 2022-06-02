package day09_scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age;
        System.out.println("Please enter your age");
        age = sc.nextByte();
        long favnumber;
        System.out.println("Please enter your favourite number");
        favnumber = sc.nextLong();
        sc.nextLine(); // when we use string after the int, we need to write this code, otherwise it won't let us to put string variable, it will just skip the code below
        System.out.println("Enter name of the favourite book");
        String favbook = sc.nextLine();

        System.out.println("your age is " + age + "\n" + "Your fav number is " + favnumber + "\n" + "your fav book is " + "\n" + favbook);
    }
}
