package day24forloop;
import java.util.Locale;
import java.util.Scanner;
public class iftheymatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase(Locale.ROOT).trim();
         String str2=sc.nextLine().toLowerCase(Locale.ROOT).trim();
        String lowToHigh1 = "";
        //  bacd
        //  0123
        for(int i=0; i < str2.length();i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    str1 = str1.replaceFirst(str1.charAt(j) + "", "");
                    break;
                }
            }
        }
       if(str1.isBlank()){
           System.out.println("anagram");




        }else{
           System.out.println("not");
       }


    }
}

