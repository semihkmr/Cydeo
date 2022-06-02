package Vesa1;

public class Q2 {

    public static int divison(int num1, int num2){
        int result = 0;
        while(num1 >= num2 ){
            num1 = num1 - num2;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(divison(4,2));
        System.out.println(divison(20,5));

    }
}
