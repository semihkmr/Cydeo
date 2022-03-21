package day16;

import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What was the grade");
        int grade = sc.nextInt();
        System.out.println("Which attemp number is it");
        int attempNumber = sc.nextInt();

        if(attempNumber==1){
            System.out.println(grade-(grade*0.1));
        }
        else if(attempNumber==2){
            System.out.println(grade-(grade*0.2));
        }
        else if(attempNumber==3){
            System.out.println(grade-(grade*0.3));
        }
        else{
            System.out.println("Invalid attemp Number");
        }
    }


}
