package day21_loops;
import java.util.Scanner;
public class middlechar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.next();
        // semih
        // 01234
        int length = word.length();
        if(length%2==0){
            System.out.println(word.substring((length/2)-1,(length/2)+1));
        }
        else{

            System.out.println(word.substring(length/2,(length/2)+1));
        }
    }
}
