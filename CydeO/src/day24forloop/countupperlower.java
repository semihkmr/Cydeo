package day24forloop;
import java.util.Scanner;
public class countupperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int lowerCase=0;
        int upperCase=0;
        int number=0;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)<='Z'&&word.charAt(i)>='A'){
                upperCase++;
            }
            else if(word.charAt(i)<='z'&&word.charAt(i)>='a'){
                lowerCase++;
            }
            else{
                number++;
            }
        }
        System.out.println(upperCase+" uppercase letters");
        System.out.println(lowerCase+" lowercase letters");

        System.out.println(number+" numbers");
    }
}
