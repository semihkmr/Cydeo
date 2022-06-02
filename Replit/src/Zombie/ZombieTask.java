package Zombie;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ZombieTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inhabitants = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
// [3, 6, 0, 4, 3, 2, 7, 0]
               Zombie(inhabitants);
    }
    public static void Zombie(int[] inhabitants){

        int sum = 0;
        for (int each : inhabitants) {
            sum += each;
        }
        int day = 0;
        while (sum > 0) {
           sum = 0;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;
            for (int i = 1; i < inhabitants.length; i++) {
                if(inhabitants[i]==0){
                    inhabitants[i-1] /=2;
                }
            }
            for (int i = inhabitants.length-2 ; i >  0; i--) {
                if(inhabitants[i] == 0) {
                    inhabitants[i+1] /= 2;
                }
            }
            for (int each : inhabitants) {
                sum += each;
            }
        }
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}

























