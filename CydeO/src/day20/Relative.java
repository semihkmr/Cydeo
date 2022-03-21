package day20;
import java.util.Scanner;
public class Relative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the name of the first ");
        System.out.println("Plese enter the name of the second");

        String firstPerson = sc.nextLine();
        String secondPerson = sc.nextLine();

        int firstlength = firstPerson.length();
        int secondlength = secondPerson.length();

        int firstSpace = firstPerson.indexOf(" ");
        int secondSpace = secondPerson.indexOf(" ");

        String firstLastName = firstPerson.substring(firstSpace+1,firstlength);
        String secondLastName = secondPerson.substring(secondSpace+1,secondlength);

        if(firstLastName.equals(secondLastName)){
            System.out.println("Related");
        }
        else{
            System.out.println("Not related");
        }
    }
}
