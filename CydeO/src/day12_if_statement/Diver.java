package day12_if_statement;
import java.util.Scanner;
public class Diver {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("Please enter your oxygen level");
        int oxygenlevel = sc.nextInt();
        if(oxygenlevel>90){
            System.out.println("your tank is full");
        }
        else if (oxygenlevel>80){
            System.out.println("still okay");
        }
        else if(oxygenlevel>70){
            System.out.println("Do not go too far");
        }
        else if(oxygenlevel>60){
            System.out.println("Start to head back");
        }
        else {
            System.out.println("Be careful now");
        }
    }
}
