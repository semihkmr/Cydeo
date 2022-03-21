package Switch1;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter day of the week");
        int dayOfWeek = sc.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }
}
