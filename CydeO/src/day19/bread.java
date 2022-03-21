package day19;
import java.util.Scanner;
public class bread {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please ");
        String str = sc.next();

        int first = str.indexOf("bread");
        int last= str.lastIndexOf("bread");
        if(first==last){
            System.out.println("nothing");
        }
        else{
            System.out.println(str.substring(first+5,last));
        }
    }
}
