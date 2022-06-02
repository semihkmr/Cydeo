package day08_relational_operators;

import java.util.Scanner;

public class Speeding {
    public static void main(String[] args) {

        boolean Speeding;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CurrentSpeed");
        System.out.println("Enter the SpeedLimit");
        int CurrentSpeed = sc.nextInt();
        int SpeedLimit = sc.nextInt();
        if (CurrentSpeed > SpeedLimit) {
            System.out.println("You are Speeding");
        } else {
            System.out.println("You are not Speeding");
        }

    }
}
