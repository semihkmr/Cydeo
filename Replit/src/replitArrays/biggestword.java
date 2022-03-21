package replitArrays;
import java.util.Scanner;
public class biggestword {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String [] words= new String[5];
        for (int i = 0; i <5 ; i++) {
            words[i]= sc.nextLine();
        }
        String longest= words[0];
        for(String each :words ){
            if(each.length()>longest.length()){
                longest=each;
            }
        }
        System.out.println(longest);

    }
}
