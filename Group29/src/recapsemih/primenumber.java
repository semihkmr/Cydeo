package recapsemih;

import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int number = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <number-1  ; i++) {
            if(number%i==0){
                isPrime=false;
            }

        }
        System.out.println(isPrime);

    }
}
