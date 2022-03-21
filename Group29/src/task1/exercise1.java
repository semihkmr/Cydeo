package task1;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number");
        String dayString1, dayString2, dayString3;
        int day=sc.nextInt();
        if(day==1){
           dayString1="Saturday";
            dayString2="Sunday";
            System.out.println(dayString1);
            System.out.println(dayString2);
        }
       else if (day==2){
           dayString2="Sunday";
            System.out.println(dayString2);
       }
       else if (day==3){
           dayString3="monday";
            System.out.println(dayString3);
       }
       else if (day==4){
           dayString1="Tuesday";
           dayString2="Wednesday";
            System.out.println(dayString1);
            System.out.println(dayString2);
            }
       else if(day==5){
           dayString2="Wednesday";
            System.out.println(dayString2);
            }
       else {
           dayString3="invalid day";
            System.out.println(dayString3);
            }

        }
    }


