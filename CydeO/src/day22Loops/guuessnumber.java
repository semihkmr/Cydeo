package day22Loops;
import java.util.Scanner;
public class guuessnumber {
    public static void main(String[] args) {

        int secNumber = 5;
        int attempNumber = 1;
        int number;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please guess the number");
            number = sc.nextInt();
            if (number == secNumber) {
                System.out.println("you guessed correctly " + attempNumber);
            } else if (number > secNumber) {
                System.out.println("Too high " + attempNumber);
            } else {
                System.out.println("Too low " + attempNumber);
            }
        attempNumber++;
        }

            while (number != secNumber) ;
  int $semih = 4;
    }
}