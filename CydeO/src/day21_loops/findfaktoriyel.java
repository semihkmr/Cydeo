package day21_loops;
import java.util.Scanner;
public class findfaktoriyel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int result = 1;
         while(number>1){

             result *= number;

             number--;

         }
        System.out.println(result);
    }
}
