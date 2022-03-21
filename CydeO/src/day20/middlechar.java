package day20;
import java.util.Scanner;
public class middlechar {
    public static void main(String[] args) {
 // semiha , semih
        Scanner sc=new Scanner(System.in);
        String word = sc.next();
        int length = word.length();
       if(length%2==0){
           System.out.println(word.substring((length/2)-1,(length/2)+1));
       }
       else{
           System.out.println(word.substring(length/2,(length/2)+1));
       }

    }
}
