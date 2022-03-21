package day26;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] number = new int[num];
        int total=0;

        for (int i = 0; i <num ; i++) {
            System.out.println("please enter a number");
            number[i] = sc.nextInt();
            total+=number[i];

        }
        int ave = total/num;
        System.out.println(ave);
    }
}
