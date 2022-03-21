package day25;
import java.util.Scanner;
public class chicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    int firstBread = str.indexOf("bread");
    int lastBread = str.lastIndexOf("bread");
        System.out.println(firstBread);
        System.out.println(lastBread);
    }
}
