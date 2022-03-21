package day19;
import java.util.Scanner;
public class task19 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter url");
        String url = sc.next();

        String  url1= url.substring(4,url.length()-4);
        System.out.println(url1);


    }
}
