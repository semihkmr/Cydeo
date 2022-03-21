package day22Loops;

import java.util.Scanner;
public class pickcolor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors="";

        while(colorsPicked<3){
            System.out.println("Pick a color");
            String color=sc.nextLine();

            if(uniqueColors.contains(color)){
                System.out.println("you already have that color");
            }
            else {
                uniqueColors +=color + " ";
                colorsPicked++;
            }
        }
        System.out.println(uniqueColors);
    }
}
