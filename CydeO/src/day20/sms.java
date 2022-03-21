package day20;
import java.util.Scanner;
public class sms {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     String sms= sc.nextLine();
     int whereName= sms.indexOf("<");
     int whereName2 = sms.indexOf(">");
     int whereNumber = sms.indexOf("[");
     int whereNumber2 = sms.indexOf("]");
     int whereMessage = sms.indexOf("{");
     int whereMessage2 = sms.indexOf("}");

        System.out.println("Sender: " +sms.substring(whereName+1,whereName2) );
        System.out.println("Number: "+ sms.substring(whereNumber+1,whereNumber2));
        System.out.println("Message: " + sms.substring(whereMessage+1,whereMessage2));

    }
}
