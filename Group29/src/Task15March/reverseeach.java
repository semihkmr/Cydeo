package Task15March;
import java.util.Scanner;
public class reverseeach {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


        System.out.println("enter");
        String sentence = sc.nextLine();
        String [] arraySentence = sentence.split(" ");
        String reverseSentence="";
        for (int i = 0; i <arraySentence.length ; i++) {

              reverseSentence+=" ";
            for (int j = arraySentence[i].length()-1 ; j >=0  ; j--) {

                reverseSentence+= arraySentence[i].charAt(j);

                }



        }
        System.out.println(reverseSentence.trim());
    }
}
