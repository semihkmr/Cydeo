package day25;
import java.util.*;
public class javapython {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(Locale.ROOT);

        int countJava =0;
        int countPython=0;
        for (int i = 0; i < str.length()-3 ; i++) {
            String everyJava = str.substring(i,i+4).toLowerCase(Locale.ROOT);
            if(everyJava.equals("java")){
                countJava++;
            }
        }
        for (int j = 0; j <str.length()-5 ; j++) {
            String everyPython = str.substring(j,j+6);
            if(everyPython.equals("python")){
                countPython++;
            }

        }
        if(countJava==countPython){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
