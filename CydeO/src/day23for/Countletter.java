package day23for;
import java.util.Locale;
import java.util.Scanner;
public class Countletter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine().toLowerCase(Locale.ROOT);
        char check = sc.nextLine().toLowerCase(Locale.ROOT).charAt(0);
        int count = 0;
        for(int i= 0 ; i<word.length() ; i++){
            if(word.charAt(i)== check){
                count++;
            }
        }
        System.out.println(count);
    }

}
