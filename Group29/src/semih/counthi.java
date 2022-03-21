package semih;
import java.util.Scanner;
public class counthi {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Please enter the sentence");
        String sentence = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i =0; i <sentence.length()-2 ; i++) {
           String str= sentence.substring(i,i+2);
            if(str.equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
