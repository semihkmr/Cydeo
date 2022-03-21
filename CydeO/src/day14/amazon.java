package day14;
// import java.util.Scanner;
public class amazon {

    public static void main(String[] args) {
    //    Scanner sc=new Scanner(System.in);
     //   System.out.println("Please Say true if you have prime ");
    //    boolean hasPrime = sc.hasNextBoolean();
      //  System.out.println("please enter the price");
      //  int price = sc.nextInt();
 boolean hasPrime = false;
 int price = 23;
        if(hasPrime==true){
            System.out.println("eligilbe for 2 day shipping");}
            else{
               if(price>=25){
                   System.out.println("Eligible for regular free shipping");

               }
              else if(price<25){
                   System.out.println("not eligible for free shipping. shipping fee 3.99");
               }

            }

        }
    }
