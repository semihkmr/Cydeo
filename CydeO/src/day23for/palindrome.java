package day23for;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a word");

        String palindrome = sc.nextLine();
        String reversed = "";
        boolean isPalindrome;
        for(int i=palindrome.length()-1; i>=0; i--){
          reversed += palindrome.charAt(i);



        }
        System.out.println(reversed.equalsIgnoreCase(palindrome));



    }
}
