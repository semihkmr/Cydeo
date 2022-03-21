package Task20March;

import java.util.Scanner;

public class WhichNumber {
    public static void findNumber(int num){
        if(num>0){
            System.out.println("It is a positive number");
        }
        else if(num<0){
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is a zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        findNumber(num);
    }

}
