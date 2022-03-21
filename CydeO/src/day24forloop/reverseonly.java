package day24forloop;
import java.util.Scanner;
public class reverseonly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sentence = sc.nextLine();
        String reverseWord="";
        int whereFirstSpace = sentence.indexOf(" ");
        int whereSecondSpace = sentence.indexOf(" ",whereFirstSpace+1);
        String whichWord = sentence.substring(whereFirstSpace,whereSecondSpace);
        for(int i=whichWord.length()-1; i>-1;i--){
            reverseWord+=whichWord.charAt(i);
        }
        reverseWord=" "+reverseWord;
        String newSentece = sentence.replace(whichWord,reverseWord);
        System.out.println(newSentece);

    }
}

