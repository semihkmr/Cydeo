package day12;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {

    Scanner  sc = new Scanner(System.in);
        System.out.println("please enter the time");
        int time=sc.nextInt();
        if (time > 6 && time <11 ){
            System.out.println("good morning");
        }
else if ( time<12 && time>16 ){
            System.out.println("Good evening");
        }
else {
            System.out.println("good night");
        }

    }
}
