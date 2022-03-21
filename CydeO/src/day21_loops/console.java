package day21_loops;
import java.util.Scanner;
public class console {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=0; int sum=0;
        while(x<=5){
            System.out.println("please enter number");
            int number = sc.nextInt();
            x++;

             sum +=x;
    }
        System.out.println(sum);


    }

}
