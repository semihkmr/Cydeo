package day25;
import java.util.Scanner;
public class duplicatechar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String duplicate= "";

        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if(count>1){
                if(!duplicate.contains(str.charAt(i)+"")){
                    duplicate+=str.charAt(i)+" ";
                }
            }

        }
        System.out.println(duplicate);
    }
}
