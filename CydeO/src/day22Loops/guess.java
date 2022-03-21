package day22Loops;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        int secretNum = 5;
        int attempts = 1;
        int num;

        do{
            Scanner input = new Scanner(System.in);
            System.out.print("guess the secret number: ");
            num = input.nextInt();

            if(num == secretNum){
                System.out.println("you guessed correctly, attempts: " + attempts);
            } else if(num < secretNum){
                System.out.println("too low, attempts: " + attempts);
            } else{
                System.out.println("too high, attempts: " + attempts);
            }

            attempts++;

        } while (secretNum != num);

    }


}
