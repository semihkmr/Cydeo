package day18;
import java.util.Locale;
import java.util.Scanner;
public class Title {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name with title");
        String titles = sc.next();
        titles = titles.toLowerCase(Locale.ROOT);

        if(titles.startsWith("mr")||titles.startsWith("mister")){
            System.out.println("Hello Sir");
        }
        else if(titles.startsWith("ms")||titles.startsWith("Miss")||titles.startsWith("Madam")){
            System.out.println("Hello Ma'am");
        }
        else if(titles.startsWith("dr")){
            System.out.println("Hello Doctor");
        }
        else if(titles.endsWith("Sr")){
            System.out.println("Nice to meet you Senior");
        }
        else if(titles.endsWith("Jr")){
            System.out.println("Nice to meet you Junior");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
