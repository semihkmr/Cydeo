package day12_if_statement;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("please enter one letter uppercase or lowercase ");
        char letter=sc.next().charAt(0); // charAt icinde sayi kac tane yazilacagini ya da kacinciyi dikkate alacagini gosteriyor, ornek olarak ABC yazdigin A = 0 , b=1 , C=2
        if (Character.isUpperCase(letter)){
            System.out.println("upper case");
        }
if (Character.isLowerCase(letter)) {
    System.out.println("lower case");
}


    }
}
