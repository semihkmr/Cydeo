package day19;
import java.util.Scanner;
public class middle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = sc.next();

        int length = word.length();

   if(length%2==0){
       System.out.println(word.substring((length/2)-1,(length/2)+1));
   }
else {
       System.out.println(word.substring((length-1)/2,((length-1)/2)+1));
   }

    }
}
