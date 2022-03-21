package Task15March;
import java.util.Arrays;
import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
        char [] nameArray = name.toCharArray();
        System.out.println(Arrays.toString(nameArray));

        System.out.println("first letter: "+ nameArray[0]);
        System.out.println("last letter: " + nameArray[nameArray.length-1]);
    }
}
