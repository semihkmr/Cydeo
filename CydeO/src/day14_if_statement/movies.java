package day14_if_statement;
import java.util.Scanner;
public class movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter duration of the movie");
        double duration = sc.nextDouble();
        double price;
        if (duration < 0 || duration > 4) {
            System.out.println("movies can not be this long");
        } else {
            if (duration == 1) {
                price = 8.99;
                System.out.println(duration + " $" + price);
            }
            if (duration == 1.5) {
                price = 10.5;
                System.out.println(duration + " $" + price);
            }
            if (duration == 2) {
                price = 12.99;
                System.out.println(duration + " $" + price);
            }
            if (duration == 2.5) {
                price = 14.50;
                System.out.println(duration + " $" + price);
            }
            if (duration == 3 || duration == 3.5 || duration == 4) {
                price = 15.99;
                System.out.println(duration + " $" + price);
            }
        }

    }
}
