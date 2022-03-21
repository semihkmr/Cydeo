package day24forloop;
import java.util.Scanner;
public class calculateslash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String word = sc.nextLine();
     int count = 1;
      for(int i=0;i<word.length();i++){
          if(word.charAt(i)=='-'&&word.charAt(i+1)!='-'){
              count++;
          }
      }
        System.out.println(count);
    }
}
