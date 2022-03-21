package day18;
import java.util.Scanner;
public class userandPass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your username");
        String username = sc.next();
        System.out.println("please enter your password");
        String password = sc.next();
         boolean validpassword1 = password.contains(username);
        int validpassword = password.length();
        if(validpassword1){
            System.out.println("Invalid password, username should not be in it");
        }
         else{
             if(validpassword<5){
                 System.out.println("Password can not be less than 5 characters");
             }
             if(validpassword==5){
                 System.out.println("Valid password");
             }
        }


    }
}
