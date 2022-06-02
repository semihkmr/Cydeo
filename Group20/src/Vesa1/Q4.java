package Vesa1;

public class Q4 {

    public static void swapNumber(int x, int y){

        x = x + y ;
        y = x - y ;
        x = x - y ;

        System.out.println("new x value: " + x);
        System.out.println("new y value: " + y);
    }

    public static void main(String[] args) {

        swapNumber(2,5);
    }
}
