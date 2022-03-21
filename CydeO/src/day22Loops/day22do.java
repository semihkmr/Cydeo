package day22Loops;

import java.util.Scanner;
public class day22do {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean keepTalking = true;
        while(keepTalking){

            System.out.println("Enter a message");
            String msg = sc.nextLine();

            switch (msg){
                case "hello":
                    System.out.println("Hello");
                    break;

                case "how are you":
                    System.out.println("I am fine");
                    break;

                case"bye":
                    System.out.println("No,do not leave");
                    keepTalking=false;
                    break;
                    default:
                        System.out.println("I do no know what you telling me ");


            }
        }

    }
}
