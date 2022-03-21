package day12;

import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first number");
       int firsNumber = sc.nextInt();
        System.out.println("Please enter second number");
        int secondNumber= sc.nextInt();
        System.out.println("Please select ");
        char islem= sc.next().charAt(0);
        if(islem== '+') {
            System.out.println(firsNumber+secondNumber);
        }
        else if (islem=='-'){
            System.out.println();
        }


    }
}
