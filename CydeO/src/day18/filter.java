package day18;
import java.util.Scanner;
public class filter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a message");
        String message = sc.next();
        message  = message.trim();

         boolean contains= message.contains("java os bad")||message.contains("quit")||message.contains("have fun")||message.contains("crying");

         if(contains){
             System.out.println("failed to message");
         }
         else{
             System.out.println("message sent");
         }

    }
}
