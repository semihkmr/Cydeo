package day18;
import java.util.Locale;
import java.util.Scanner;
public class LongestwithA {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first word");
        String firstWord= sc.next().toLowerCase(Locale.ROOT);
        System.out.println("Please enter second word");
        String secondWord = sc.next().toLowerCase(Locale.ROOT);
        System.out.println("Please enter third word");
        String thirdword = sc.next();
        int firstlenght = firstWord.length();

        int secondlenght= secondWord.length();

        int thirdlenght= thirdword.length();

        if(firstWord.contains("a")&&firstWord.contains("d")){
            if(firstlenght>secondlenght&&firstlenght>thirdlenght){
                System.out.println(firstWord);
            }
        }
        else if(secondWord.contains("a")&&secondWord.contains("d")){
            if(secondlenght>firstlenght&&secondlenght>thirdlenght){
                System.out.println(secondWord);
            }

        }
        else if(thirdword.contains("a")&&thirdword.contains("d")){
            if(thirdlenght>firstlenght&&thirdlenght>secondlenght){
                System.out.println(thirdword);
            }
        }
        else{
            System.out.println("The word you choose does not fit requirements");
        }
    }
}
