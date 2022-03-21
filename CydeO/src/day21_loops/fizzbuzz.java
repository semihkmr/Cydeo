package day21_loops;
import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

         while(number<=50){
             if(number%3==0&&number%5==0){
                 System.out.println("fizzbuzz");
             }
             else if(number%3==0){
                 System.out.println("fizz");
             }
             else if(number%5==0){
                 System.out.println("buzz");
             }
             else{
                 System.out.println(number);
             }

         number++;
         }



    }
}
