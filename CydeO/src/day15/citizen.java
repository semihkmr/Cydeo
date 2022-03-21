package day15;
import java.util.Scanner;
public class citizen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you a citizen");
        boolean isCitizen = sc.nextBoolean();
        System.out.println("Are you a resident");
        boolean isResident = sc.nextBoolean();
        System.out.println("do you have a high school diploma");
        boolean hasDiploma = sc.nextBoolean();
        System.out.println("How old are you");
        int age = sc.nextInt();

        if((isCitizen|| isResident)&&hasDiploma&&(age >=18 && age<=35)){
            System.out.println("You are qualified for the Army");
        }
        else{
            if(!isCitizen&&!isResident){
                System.out.println("your are not qualified you are resident or citizen");
            }
            if(!hasDiploma){
                System.out.println("you do not have a diploma");
            }
            if(age<=18||age>=35){
                System.out.println("you are old :)");
            }
        }

    }
}
