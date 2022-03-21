package day19;
import java.util.Scanner;

public class prefix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        int n=sc.nextInt();
        int length = word.length();
        String prefix = word.substring(0,n);
        System.out.println(prefix);
        int hasPrefix = word.indexOf(prefix,n);


        if(hasPrefix==-1){
            System.out.println("false");
        }
      else {
            System.out.println("true");
        }
    }
}

