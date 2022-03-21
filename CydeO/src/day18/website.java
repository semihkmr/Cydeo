package day18;
import java.util.Locale;
import java.util.Scanner;
public class website {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the url");
        String url = sc.next();
        url = url.toLowerCase(Locale.ROOT);
        boolean validStart = url.startsWith("www.");
        boolean validEnd =url.endsWith(".com")||url.endsWith(".edu")||url.endsWith(".gov")||url.endsWith(".net");

        if(validStart&&validEnd){
            System.out.println("This is real website ");
        }
        else
        {
          if(!validStart){
              System.out.println("url needs to start with www.");
          }
          if(!validEnd){
              System.out.println("url needs to en with .com or .edu or .net or .gov");
          }
        }

    }
}
