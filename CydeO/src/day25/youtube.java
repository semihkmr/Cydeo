package day25;
import java.util.Scanner;
public class youtube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <=number ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
                System.out.println();


        }
        for (int i = number-1; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
