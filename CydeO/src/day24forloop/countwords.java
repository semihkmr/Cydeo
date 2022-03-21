package day24forloop;
import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();

        int count= 1;
        for(int i=0; i< sentence.length(); i++ ){
        if(sentence.charAt(i)==' '&& sentence.charAt(i+1)!=' '){
            count++;
        }


        }
        System.out.println("\n-------RESULT----------");
        if(sentence.isBlank()){
            System.out.println("no words");
        }
        else{
            System.out.println(count);
        }
    }
}
