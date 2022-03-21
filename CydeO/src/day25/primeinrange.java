package day25;
import java.util.Scanner;
public class primeinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String primeNumber = "";
        boolean isPrime;
        for (int i = 2; i < number; i++) {

            isPrime=true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                   isPrime=false;
                   break;

                }
                    }
             if (isPrime){
                 primeNumber+= i+",";
                }

            }
        System.out.println(primeNumber.substring(0,primeNumber.lastIndexOf(',')));
        }
    }

