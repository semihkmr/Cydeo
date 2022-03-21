package day14;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");
       int age = sc.nextInt();
        if(age<0&&age>120){
            System.out.println("Invalid age");
        }
        else{
            if(age<=2){
                System.out.println("Baby");
            }
            if(age>=3&&age<=5){
                System.out.println("toddler");
            }
            if(age>=6&&age<=9){
                System.out.println("Kid");
            }
            if(age>=10&&age<=12){
                System.out.println("Pre-teen");
            }
            if(age>=13&&age<=17){
                System.out.println("Teenager");
            }
            if(age>=18&&age<=20){
                System.out.println("Young Adult");
            }
            if(age<=21&&age>=35){
                System.out.println("Adult");
            }
            if(age<=36&&age>=55){
                System.out.println("Middle-Age Adult");
            }
            if(age>=55){
                System.out.println("Senior Citizen");
            }
        }
    }
}
