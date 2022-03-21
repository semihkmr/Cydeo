package day33;

import java.util.Scanner;

public class Age {

    public static void getAge(int birthYear){

        System.out.println("Age: " +  (2022- birthYear));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear = sc.nextInt();
        getAge(birthYear);

    }
}
