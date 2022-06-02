package day14_if_statement;
import java.util.Scanner;
public class house {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your budget");
        int budget =sc.nextInt();
        if(budget>=80000&&budget<=100000)
        {
            System.out.println("name - Hills \n average price 80,000 - 100,000 \n rating 4.0 \n gated - no \n allows pets - no ");
        }
        else if (budget>=55000&&budget<=75000){
            System.out.println("name - Oaks \n average price 55,000 - 75,000 \n rating - 3.5 \n gated - no \n allows pets - yes");
        }
        else if(budget>=120000&&budget<=150000){
            System.out.println("name - Highland \n average price 120,000 - 150,000 \n rating - 4.5 \n gated - yes \n allow pets - no");
        }
        else if(budget<=160000&&budget>=201000) {
            System.out.println("name - Canyon \n average price 160,000 - 201,000 \n rating - 4.8 \n gated- yes \n allow pets-yes");
        }
        else if (budget<0){
                System.out.println("that is not valid budget");
            }
        else if (budget>300000){
                System.out.println("too much money for this agency");
            }
         else{
                System.out.println("No available house");
        }

    }
}
