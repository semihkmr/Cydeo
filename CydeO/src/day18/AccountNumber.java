package day18;
import java.util.Scanner;
public class AccountNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your account number");
        String accountNumber = sc.next();
      boolean emptyInputs = accountNumber.isEmpty();
      boolean startwith2= accountNumber.startsWith("2");
      boolean startwith5= accountNumber.startsWith("5");

      if(emptyInputs){
          System.out.println("Empty input given");
      }
       else{
           if(startwith2){
              if(accountNumber.length()==7){
                  System.out.println("Valid-7 digit account number");

              }
              else{
                  System.out.println("Invalid-7 digit account number");
              }
           }
           else if(startwith5){
              if(accountNumber.length()==10){
                  System.out.println("Valid-10 digit account number");
              }
              else{
                  System.out.println("Invalid-10 digit account number");
              }
          }
           else {
               System.out.println("Invalid account number");
           }


      }




    }
}
