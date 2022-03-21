package day20;
import java.util.Scanner;
public class etsy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = sc.nextLine();

        int length = url.length();
        int categoryIndex= url.indexOf("c/");
        System.out.println(categoryIndex);
        int categoryIndex2 = url.indexOf("/",categoryIndex+2);
        System.out.println(categoryIndex2);
        String categoryName = url.substring(categoryIndex+2,categoryIndex2);
        categoryName = categoryName.replace("-"," ");

        System.out.println("Main Category name is "+ categoryName);
    }
}
