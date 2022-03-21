package day14;
import java.util.Scanner;
public class ssn {
    public static void main(String[] args) {
       int expectedpin=1552;
        int expectedssn=1234;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your code");
        int pincode=sc.nextInt();
        System.out.println("please enter your last 4 digit of ssn");
        int last4ssn= sc.nextInt();
         if(pincode==expectedpin && last4ssn==expectedssn){
             System.out.println("succesfull");
        }
         else  {
             System.out.println("failed");

             if(pincode!=expectedpin){
                 System.out.println("invalid pincode");
             }
             if(last4ssn!=expectedssn){
                 System.out.println("invalid ssn");
             }
         }
    }
}
