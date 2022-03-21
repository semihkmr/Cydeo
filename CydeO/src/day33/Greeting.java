package day33;

import java.util.Scanner;

public class Greeting {

    public static void hello(String name){

        System.out.println("hello "+ name + " , how are you");

    }

    public static void main(String[] args) {
        hello("semih");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        hello(name);

    }
}
