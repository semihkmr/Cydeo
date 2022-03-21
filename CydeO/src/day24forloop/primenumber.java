package day24forloop;
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
    int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++) {
              if(number%i==0){
                count++;
              }

        }
        if(count>0){
            System.out.println("not Prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
