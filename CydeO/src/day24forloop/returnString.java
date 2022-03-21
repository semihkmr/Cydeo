package day24forloop;
import java.util.Scanner;
public class returnString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word");
        String str = sc.nextLine();
        System.out.println("Please enter the number");
        int number = sc.nextInt();

        for(int i=0; i<number;i++){
            str+=str.charAt(str.length()-1);
        }
        System.out.println(str);
    }
}
