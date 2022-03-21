package replitArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ShortesWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the words");

        String words = sc.nextLine();
        String[] arrayWord = words.split(", ");
        String smallest = arrayWord[0];
        String sameSize="";
        for(String each:arrayWord){
            if(each.length()<smallest.length()){
                smallest=each;
            }
        }
        for(String each:arrayWord){
            if(each.length()==smallest.length()){
                sameSize+=" "+each;
            }
        }
        System.out.println(sameSize);
        String[] arraySameSize = sameSize.trim().split(" ");
        System.out.println(Arrays.toString(arraySameSize));


    }
}
