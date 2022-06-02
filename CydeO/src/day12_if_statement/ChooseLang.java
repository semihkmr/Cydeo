package day12_if_statement;
import java.util.Scanner;
public class ChooseLang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For English 1"+"\n"+"For Spanish 2"+"\n"+"For Turkish 3"+"\n"+"For Russian 4"+"\n"+"For French 5");
        int num1 = sc.nextInt();
       String sonuc= num1==1?"Hello":num1==2?"Hola":num1==3?"Merhaba":num1==4?"Privet":num1==5?"Merci":"We will use English";
        System.out.println(sonuc);
    }
}
