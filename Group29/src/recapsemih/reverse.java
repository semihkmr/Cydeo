package recapsemih;

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         String sentence = sc.nextLine();

         int whereTheSpace= sentence.indexOf(" ");
         int whereTheSecondSpace = sentence.indexOf(" ",whereTheSpace+1);

         String middleWord= sentence.substring(whereTheSpace+1,whereTheSecondSpace);
        System.out.println(middleWord);












    }

}
