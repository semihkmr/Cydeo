package day12;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the Month : ex ; 1 for January");
        int numOfMonth = sc.nextInt();
        if (numOfMonth==1 || numOfMonth==3|| numOfMonth==5|| numOfMonth==7|| numOfMonth==8|| numOfMonth==10 || numOfMonth==12)
        {
            System.out.println("31 days");
        }
        else if(numOfMonth==4||numOfMonth==6||numOfMonth==9||numOfMonth==11)
        {
            System.out.println("30 days");

        }
        else
        {
            System.out.println("28 days");
        }
    }
}
