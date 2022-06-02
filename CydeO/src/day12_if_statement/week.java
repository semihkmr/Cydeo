package day12_if_statement;
import java.util.Scanner;
public class week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number between 1 to 7");
       int  number  = sc.nextInt();

      String week = (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        System.out.println(week);
    }
}
