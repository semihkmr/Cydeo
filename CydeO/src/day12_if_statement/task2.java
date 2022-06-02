package day12_if_statement;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sales amount");
        int sales = sc.nextInt();
        if (sales<10000){
            System.out.println("you do not get bonus");
        }
        else if(sales >= 10000 && sales<15000 ){
            System.out.println("you get bonus of 5000");
        }
        else {
            System.out.println("you get bonus of 7000");
        }
    }

}
