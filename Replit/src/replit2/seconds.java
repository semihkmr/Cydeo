package replit2;
import java.util.Scanner;
public class seconds {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter second:");
       int inputseconds =sc.nextInt();
       int seconds = inputseconds % 60;
       int hours = inputseconds / 60;
       int minutes = hours % 60;
       hours = hours / 60;
        System.out.println( hours + " hours "+ minutes+ " minutes "+ seconds + " seconds ");

    }
}
